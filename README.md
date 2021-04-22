
Spring Reactive
---------------------------------------------------

    Pre-Requisite Skills
    =============================================================
        Java 8 Features
            Java Streams API

        NoSQL Database
            MongoDB

        Spring Framework
            Spring Core and IoC
            Spring Web MVC
            Spring Boot
            Spring REST
            Spring Data

    Lab Setup
    -----------------------------------------

        JDK 8
        STS
        MongoDB
        Chrome
        Isomnia / Postman

    Reactive Programming
    -------------------------------------------------------------------------------

        Reactive Programming = Non-Blocking (async) +  Event Driven.


        Synchronous way opf doing it
        ------------------------------------------------------------
        1000 records in a database
                DAO      to retrive all data
                Service     soem computation happens
                Controller      collect this data
                                        and give to the UI 

                                                                UI receive the data and put it on the screnn
                                                                    and until the the ui has to wait...


        Asynchronous way of doing it
        ------------------------------------------------------------
        1000 records in a database
                DAO      to retrive all data
                Service     soem computation happens (a thread can be created to process the data)
                Controller      collect this data
                                        and give to the UI 

                                                                UI receive the data and put it on the screnn
                                                                    and until the the ui has to wait...


        Reactive Programming (Evetn Driven + Asynchronous) way of doing it
        ------------------------------------------------------------
        1000 records in a database
                DAO      to retrive all data
                Service     soem computation happens (Streams API and Observable Pattern)
                Controller      collect the Observable
                                        and give to the UI 
                                                                UI receive the observable and 
                                                                can subscribe to his observable.

                        Observable ---------------------------->  observer (the one who subscribes)
                                                    OnNext     react to the onnext event, recive the data an display
                                                    OnError    react to the error
                                                    OnComplete  then job is accomplished,


            ReactiveX
                        Manifesto
            ---------------------------------------------------------------------

                Project Reactive
                RxJava

            RxJava
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

                        Observable ---------------------------->  observer (the one who subscribes)
                                                    OnNext     react to the onnext event, recive the data an display
                                                    OnError    react to the error
                                                    OnComplete  then job is accomplished,






    
