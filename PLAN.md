# Plan

Okay, so the thing is that the library should return an ElementTree object; this object should be able to return the value (type Object) of every node on the XML. 

So, to do this firstly I need 2 principal things to do:

- Parse the DTD file to know the structure of the XML file
- Verify the lexical and syntax of the XML file

After re reading i saw that i need both XML and DTD parser, this because i need the XML file to have the constraints, and the DTD file to define the structure of the XML. 

I have an XML example and a DTD example [DTD](database.dtd) & [XML](database.xml)
