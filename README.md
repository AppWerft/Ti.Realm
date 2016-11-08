#Ti.Realm

It is only a playground and cannot work. 
Reason: native library uses gradle plugin to manipulate bytecode of app.

<img src="https://realm.io/assets/svg/general_logo.svg" width=60> This is a Titanium module for interacting with Realm.io. 

Realm is a mobile platform and a replacement for SQLite & Core Data. Loved by developers and hundreds of millions of users, Realm is faster, easier to use, and (best of all) free. 

##Usage

First you have to add one entry to tiapp.xml:
```xml
<Property name="OBJECT_SERVER_IP" type="string">192.168.1.56</Property>
```

And now:
```javascript
var Realm = require("de.appwerft.realm");

Realm.createObject({
    name : "Bello",
    age : 23
});