import urllib
import addressbook_pb2

f = urllib.urlopen("http://localhost:9998/person")
person = addressbook_pb2.Person()
person.ParseFromString(f.read())
print person.name
