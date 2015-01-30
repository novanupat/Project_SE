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
    คลิก "faname"
    พิมพ์ "Worapong"
    คลิก "lname"
    พิมพ์ "meemak"
    คลิก "salutation"
    พิมพ์ "Mr."
    คลิก "Email"
    พิมพ์ "el-hot-met@hotmail.com"
    คลิก "password"
    พิมพ์ "pass1234"
    คลิก "Sbutton"

แล้วเจอ Successful

    เจอ "Sucessful"
    คลิก "ok"
    
ทำงานเสร็จแล้วปิดโปรแกรม

    ปิด