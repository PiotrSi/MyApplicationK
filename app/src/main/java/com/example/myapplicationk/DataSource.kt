package com.example.myapplicationk

import com.example.myapplicationk.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Example!",
                    "Example",
                    "https://images.unsplash.com/photo-1470770903676-69b98201ea1c?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80",
                    "John1"
                )
            )
            list.add(
                BlogPost(
                    "Example",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://images.unsplash.com/photo-1447752875215-b2761acb3c5d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fG5hdHVyZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
                    "John2"
                )
            )

            list.add(
                BlogPost(
                    "Example",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "https://images.unsplash.com/photo-1426604966848-d7adac402bff?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80",
                    "John3"
                )
            )
            list.add(
                BlogPost(
                    "Example",
                    "Example",
                    "https://images.unsplash.com/photo-1470071459604-3b5ec3a7fe05?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1140&q=80",
                    "John4"
                )
            )
            list.add(
                BlogPost(
                    "Example",
                    "Example",
                    "https://images.unsplash.com/photo-1469474968028-56623f02e42e?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1053&q=80",
                    "John4"
                )
            )
            list.add(
                BlogPost(
                    "Example",
                    "Example",
                    "https://images.unsplash.com/photo-1469053913977-1d2f009670d9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1055&q=80",
                    "John5"
                )
            )
            list.add(
                BlogPost(
                    "Example",
                    "Example",
                    "https://images.unsplash.com/photo-1450101215322-bf5cd27642fc?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1190&q=80",
                    "John6"
                )
            )
            list.add(
                BlogPost(
                    "Example",
                    "Example",
                    "https://images.unsplash.com/photo-1439074216907-51e7025705db?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1067&q=80",
                    "John7"
                )
            )
            list.add(
                BlogPost(
                    "Example",
                    "Example",
                    "https://images.unsplash.com/photo-1567365356752-77c327cdeb54?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDIwfHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60",
                    "John8"
                )
            )
            return list
        }
    }
}