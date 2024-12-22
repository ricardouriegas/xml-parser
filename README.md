# XML Parser (DEPRECATED)
The project was did by my teammate for the main project. [Here you can find it](https://github.com/JNArrazola/XML-DTD_Parser)

This is a Vanilla XML parser using Java, the reason of this project is because i need to do on for my other project [SQL Parser](https://github.com/ricardouriegas/sql_parser). This XML parser will be use to store all the constraints of the database of the another project.

## === First Idea of Using ===

After re reading i saw that i need both XML and DTD parser, this because i need the XML file to have the constraints, and the DTD file to define the structure of the XML. Here an example:

### DTD

> database.dtd

```xml
<!ELEMENT database (table+)>
<!ELEMENT table (name, columns, rows)>
<!ELEMENT columns (column+)>
<!ELEMENT column (name, type, constraints?)>
<!ELEMENT name (#PCDATA)>
<!ELEMENT type (#PCDATA)>
<!ELEMENT constraints (constraint*)>
<!ELEMENT constraint (#PCDATA)>
```

### XML

> database.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- DTD declaration -->
<!DOCTYPE database SYSTEM "database.dtd">

<!-- XML format based on DTD -->
<database>
   <table>
      <name>users</name>
      <columns>
         <column>
            <name>id</name>
            <type>integer</type>
            <constraints>
               <constraint>primary key</constraint>
               <constraint>not null</constraint>
            </constraints>
         </column>
         <column>
            <name>name</name>
            <type>string</type>
            <constraints>
               <constraint>not null</constraint>
            </constraints>
         </column>
         <column>
            <name>age</name>
            <type>integer</type>
            <constraints>
               <constraint>min 0</constraint>
               <constraint>max 120</constraint>
            </constraints>
         </column>
         <column>
            <name>email</name>
            <type>string</type>
            <constraints>
               <constraint>unique</constraint>
            </constraints>
         </column>
      </columns>
   </table>
</database>
```
