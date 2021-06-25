import requests
#import parsec
import re

search = "minino"
response =  requests.get('https://dle.rae.es/'+search+'?m=form')
#parse.urlencode({'search_query':'minino'})
#url = "https://dle.rae.es/minino?m=form"
#response = requests.get(url)

if response.status_code == 200:
	#response_json = response.json()
	#origin = response_json['origin']
	#print(origin)
	#print(response.content)
	print(response.content)
