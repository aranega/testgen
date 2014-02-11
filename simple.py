from datetime import datetime

class enum1:
	LITERAL, LITERAL2 = range(2)


class MyInterface(object):
	pass
	# Start of user code -> properties/constructors for MyInterface class(interface)

	# End of user code
	# Start of user code -> methods for MyInterface class(interface)

	# End of user code

class A(object):
	"""
	 Doc
	"""
	def __init__(self):
		self.name = ""
		
	# Start of user code -> properties/constructors for A class

	# End of user code
	def getName(self):
		# Start of user code protected zone for getName function body
		return ""
		# End of user code	
	# Start of user code -> methods for A class

	# End of user code

class B(A, C):
	"""
	 Doc
	"""
	def __init__(self):
		self.attribute = datetime()
		self.c = None
		
	# Start of user code -> properties/constructors for B class

	# End of user code
	# Start of user code -> methods for B class

	# End of user code

class C(MyInterface):
	def __init__(self):
		self.b = None
		
	# Start of user code -> properties/constructors for C class(interface)

	# End of user code
	# Start of user code -> methods for C class(interface)

	# End of user code


# Start of user code -> functions/methods for simple package

# End of user code
