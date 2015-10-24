import os
import kivy
kivy.require('1.9.0')

from kivy.app import App
from controller.StartupController import StartupController

class BubbleCloudLauncher(App):
	
	def build(self):
		#set environment variables
		os.environ["VIEW_LOCATION"] = "view/"		
		return StartupController()
		
if __name__ == '__main__':
	BubbleCloudLauncher().run()
