import pyttsx3

engine = pyttsx3.init()
engine.say('Hello Word')
engine.runAndWait()

import speech_recognition as sr

r = sr.Recognizer()

with sr.Microphone() as source:
	audio = r.listen(source)
	try:
		text = r.recognizer_google(audio, language="es")
		print(text)
	except:
		print(ERROR)