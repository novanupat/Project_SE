aเอกสารข้อกำหนด
============

เอกสารฉบับนี้แสดงตัวอย่างการเขียนข้อกำหนด ATDD ด้วย Markdown

    สืบทอดจาก spock.lang.Specification

ข้อกำหนดที่ 1. เรื่องตรวจสอบ hello world ใน notepad
---------------------------------------------

กำหนดให้ความเหมือนของการเปรียบเทียบอยู่ที่ระดับ 0.8

    ความเหมือน 0.8

เมื่อเปิดโปรแกรม chrome

    เปิด "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"

และคลิก Address bar ![](Addressbar.png)

    คลิก "Addressbar"
    หยุด 1 วินาที
    พิมพ์ "http://localhost:8080/project/\n"
    หยุด 1 วินาที
    
และคลิก Register

    คลิก "Register"
    คลิก "country"
    พิมพ์ "Thailand"
    คลิก "company name"
    พิมพ์ "Cpe Coperation"
    คลิก "vat"
    พิมพ์ "ID123456789"
    คลิก "company phone"
    พิมพ์ "044-4444444"
    คลิก "street name"
    พิมพ์ "University road"
    คลิก "street number"
    พิมพ์ "123/45"
    คลิก "postcode"
    พิมพ์ "30000"
    คลิก "Town"
    พิมพ์ "meang"
    คลิก "province"
    พิมพ์ "Korat"
    คลิก "fname"
    พิมพ์ "Worapong"
    คลิก "lname"
    พิมพ์ "meemak"
    คลิก "salutation"
    พิมพ์ "Mr."
    คลิก "Email"
    พิมพ์ "el-hot-met@hotmail.com"
    คลิก "password"
    พิมพ์ "pass1234"
    คลิก "Save button"

และเจอ Successful

    เจอ "Sucessful"
    คลิก "ok"
    
และคลิก User และ Password

    คลิก "User"
    พิมพ์ "admin"
    คลิก "Pword"
    พิมพ์ "1234"
    
และคลิก Log In 

    คลิก "Log In"
    
และเจอ Welcome

    เจอ "Welcome"
    คลิก "okLonin"
    หยุด 5 วินาที
    
และ

    คลิก "Shipment"
    คลิก "Packaging Type"
    พิมพ์ "Regular"
    คลิก "Shipment reference"
    พิมพ์ "abc1234"
    คลิก "Piece Contents"
    พิมพ์ "Document"
    คลิก "Weight"
    พิมพ์ "10"
    คลิก "Lenght"
    พิมพ์ "12"
    คลิก "Width"
    พิมพ์ "12"
    คลิก "High"
    พิมพ์ "20"
    คลิก "Add"
    
และเจอ total

    คลิก "ลง"
    คลิก "ลง"
    คลิก "ลง"
    คลิก "ลง"
    คลิก "next"
    เจอ "total"
    คลิก "oktotal"
    
และคลิก Type of Transport

    คลิก "Type of Transport"
    คลิก "Boat"
    คลิก "Save"
    เจอ "choose"
    คลิก "okchoose"
    
และคลิก Receiver

    คลิก "Receiver"
    คลิก "Firsname"
    พิมพ์ "anupat"
    คลิก "Lastname"
    พิมพ์ "Sompao"
    คลิก "Phonenumber"
    พิมพ์ "0999999999"
    คลิก "Building"
    พิมพ์ "Surasawad"
    คลิก "nonStreet"
    พิมพ์ "masawittayalai"
    คลิก "District"
    พิมพ์ "Mueng"
    คลิก "nonProvince"
    พิมพ์ "nakhonratchasima"
    คลิก "nonPostcode"
    พิมพ์ "30000"
    คลิก "nonCountry"
    พิมพ์ "Thailand"
    คลิก "Save"
    เจอ "save success"
    คลิก "OK save"
    คลิก "Next"

และคลิก Check status

    คลิก "Check status"
    หยุด 5 วินาที
    
และคลิก Log Out

    คลิก "Log Out"
    
แล้ว

    เจอ "Thank you so much"
    คลิก "OKlogout"

ทำงานเสร็จแล้วปิดโปรแกรม

    ปิด