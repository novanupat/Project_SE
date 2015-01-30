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
    เจอ "fname"
    หยุด 5 วินาที
    
และคลิก Log Out

    คลิก "Log Out"
    
แล้ว

    เจอ "Thank you so much"
    คลิก "OKlogout"

ทำงานเสร็จแล้วปิดโปรแกรม

    ปิด