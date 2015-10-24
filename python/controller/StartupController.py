from kivy.uix.widget import Widget
import os
from kivy.lang import Builder

class StartupController(Widget):
	def __init__(self, **kwargs):
		Builder.load_file(os.environ["VIEW_LOCATION"]+'startup.kv')	