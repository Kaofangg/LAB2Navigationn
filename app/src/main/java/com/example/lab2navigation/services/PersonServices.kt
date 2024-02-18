package com.example.lab2navigation.services

import com.example.lab2navigation.Person
import com.example.lab2navigation.R

class PersonServices {
    val persons: List<Person> = listOf<Person>(
        Person("นายกมล จันบุตรดี", "643450063-8", R.drawable.ake),
        Person("นายจักรพรรดิ์ อนุไพร", "643450065-4", R.drawable.dew),
        Person("นายเจษฎา ลีรัตน์", "643450067-0", R.drawable.jatsada),
        Person("นายชาญณรงค์ แต่งเมือง", "643450069-6", R.drawable.channarong),
        Person("นายณัฐกานต์ อินทรพานิชย์", "643450072-7", R.drawable.wai),
        Person("นางสาวทัศนีย์ มลาตรี", "643450075-1", R.drawable.thatsanee),
        Person("นายธนาธิป เตชะ", "643450076-9", R.drawable.thanathip),
        Person("นายปรเมศวร์ สิทธิมงคล", "643450078-5", R.drawable.make),
        Person("นายประสิทธิชัย จันทร์สม", "643450079-3", R.drawable.prasittichai),
        Person("นางสาวพรธิตา ขานพล", "643450080-8", R.drawable.beam),
        Person("นายพีระเดช โพธิ์หล้า", "643450082-4", R.drawable.peet),
        Person("นายวิญญู พรมภิภักดิ์", "643450084-0", R.drawable.winyu),
        Person("นางสาวศรสวรรค์ ไพรอนันต์", "643450085-8", R.drawable.sornsawan),
        Person("นายศรันย์ ซุ่นเส้ง", "643450086-6", R.drawable.saran),
        Person("นางสาวสุธาดา โสภาพ", "643450089-0", R.drawable.suthada),
        Person("นายอภิทุน ดวงจันทร์คล้อย", "643450092-1", R.drawable.ond),
        Person("นางสาวอมรรัตน์ มาระเหว", "643450094-7", R.drawable.teyy),
        Person("นายอรัญ ศรีสวัสดิ์", "643450095-5", R.drawable.arun),
        Person("นางสาวกฤติยา สินโพธิ์", "643450320-4", R.drawable.krittiya),
        Person("นายก้องภพ ตาดี", "643450321-2", R.drawable.model),
        Person("นายเกรียงศักดิ์ หมู่เมืองสอง", "643450322-0", R.drawable.singto),
        Person("นายเจษฏา พบสมัย", "643450323-8", R.drawable.chetsada),
        Person("นายเทวารัณย์ ชัยกิจ", "643450324-6", R.drawable.tewarun),
        Person("นายธนบดี สวัสดี", "643450325-4", R.drawable.teammy),
        Person("นางสาวนภัสสร ดวงจันทร์", "643450326-2",R.drawable.cream),
        Person("นางสาววรรณภา เบ้านาค", "643450330-1", R.drawable.wannapa),
        Person("นายศุภชัย แสนประสิทธิ์", "643450332-7", R.drawable.supachai),
        Person("นางสาวอฆพร ไร่ขาม", "643450334-3", R.drawable.akaporn),
        Person("นายกฤตวัฒน์ อินทรสิทธิ์", "643450644-8", R.drawable.kaofang),
        Person("นางสาวณัฐธิดา บุญพา", "643450647-2", R.drawable.natthida),
        Person("นายรัตพงษ์ ปานเจริญ", "643450650-3", R.drawable.tey)
    )
    public fun GetAllPersonData(): List<Person>{
        return persons
    }
    public fun GetPersonDataByID(id:String) {
        //search data by id
        return //Homework
    }
}
