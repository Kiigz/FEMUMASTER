package com.example.femu.models


class Account {
    var name:String = ""
    var email:String = ""
    var title:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, email: String, title: String,imageUrl: String, id: String) {
        this.name = name
        this.email = email
        this.title= title
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}