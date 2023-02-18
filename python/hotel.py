import requests

import pymongo
import json
from datetime import datetime, timedelta
import logging

# Set up logging configuration
logging.basicConfig(filename='hotel.log', level=logging.DEBUG)

# Example usage






def inser_data_to_db(data):
    # Connect to the MongoDB database
    client = pymongo.MongoClient('mongodb://localhost:27017/')

    db = client['mydatabase']
    collection = db['mycollection']

    data = json.loads(data)
    # Insert the data into the collection

    collection.insert_one(data)


def get_hotel_search_api_data(checkin,checkout,city_name,country_name):
    # Set the API endpoint URL
    payload = ""
    result = ""
    try:
        url = "https://travelnext.works/api/hotel_trawexv6/hotel_search"

        # Set the request payload (data to be sent to the API)
        payload = {
            "user_id": "atharvalath96_testAPI",
            "user_password": "atharvalath96Test@2023",
            "access": "Test",
            "ip_address": "49.36.184.44",
            "checkin": checkin ,
            "checkout": checkout,
            "city_name": city_name,
            "country_name": country_name,
            "occupancy": [
                {
                    "room_no": 1,
                    "adult": 2,
                    "child": 0,
                    "child_age": [
                        0
                    ]
                }
            ],
            "requiredCurrency": "INR"
        }
        print(payload)
        # Make the POST request
        response = requests.post(url, json=payload)

        # Check the response status code
        if response.status_code == 200:
            # API call was successful
            print("API call successful")
            result = response.text
        # print(response.text)
        else:
            # API call failed
            print("API call failed with status code:", response.status_code)
    except:
        logging.error('Could not get response from Trawex API for payload'+payload)
        pass

    return result



def create_data_to_upload(check_in, check_out, city, country):
    try:
        data = get_hotel_search_api_data(check_in,check_out,city,country)
        parsed_json = json.loads(data)

        # Access the itineraries list
        itineraries = parsed_json['itineraries']

        now = datetime.now()

        date_of_search = now.strftime("%Y-%m-%d")

        # Print the itineraries
        for parsed_json in itineraries:


            #parsed_json = json.loads(itinerary)

            # Add a new field to the JSON object
            parsed_json['date_of_search'] = date_of_search
            parsed_json['date_check_in'] = check_in
            parsed_json['date_check_out'] = check_out
            parsed_json['key'] = parsed_json['hotelId'] + "_" + check_in

            # Convert the updated JSON object back to a string
            updated_json = json.dumps(parsed_json)
            inser_data_to_db(updated_json)
    except:
        logging.error('This is an error log message')
        pass

def days_wise_data_upload(start_date, days, city, country):
    # Define the starting date
    #start_date_str = "2023-02-24"
    start_date = datetime.strptime(start_date, "%Y-%m-%d").date()

    # Define the number of days to increment
    days_to_increment = days
    checkin_date = start_date
    checkout_date = start_date + timedelta(days=1)

    create_data_to_upload(checkin_date.strftime("%Y-%m-%d"),checkout_date.strftime("%Y-%m-%d"),city,country)
    # Loop through and increment the date
    for i in range(days_to_increment):
        try:

            checkin_date = checkin_date + timedelta(days=1)
            checkout_date = checkout_date + timedelta(days=1)

            create_data_to_upload(checkin_date.strftime("%Y-%m-%d"),checkout_date.strftime("%Y-%m-%d"),city,country)
        except:
            logging.error('could not able to create data payload for check in date '+checkin_date.strftime("%Y-%m-%d"))
            pass

logging.info('script started')

'''
input: start_date :2023-02-24
       days : 10 (how long you want to store data)
       city : Udaipur 
       country : india
'''
days_wise_data_upload("2023-02-24",1,"Udaipur","India")

'''
        "checkin": "2023-02-24",
        "checkout": "2023-02-25",
        "city_name": "Bangalore",
        "country_name": "India",
'''
#print(get_hotel_search_api_data("2023-02-24","2023-02-25","Bangalore","India"))
#my_function()

logging.info('script completed ')



