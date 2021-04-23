
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

                RxJava2
                Project Reactor

            RxJava2
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-


            <dependency>
                <groupId>io.reactivex.rxjava2</groupId>
                <artifactId>rxjava</artifactId>
                <version>2.2.21</version>
		    </dependency>


                        Observable ---------------------------->  observer (the one who subscribes)
                                                    OnNext     react to the onnext event, recive the data an display
                                                    OnError    react to the error
                                                    OnComplete  then job is accomplished,

            just(T item) − Returns an Observable that signals the given (constant reference) item and then completes.

            fromIterable(Iterable source) − Converts an Iterable sequence into an ObservableSource that emits the items in the sequence.

            fromArray(T... items) − Converts an Array into an ObservableSource that emits the items in the Array.

            fromCallable(Callable supplier) − Returns an Observable that, when an observer subscribes to it, invokes a function you specify and then emits the value returned from that function.

            fromFuture(Future future) − Converts a Future into an ObservableSource.

            interval(long initialDelay, long period, TimeUnit unit) − Returns an Observable that emits a 0L after the initialDelay and ever increasing numbers after each period of time thereafter.

            create
                Creates an Observable from scratch and allows observer method to call programmatically.

            Defer
                Do not create an Observable until an observer subscribes. Creates a fresh observable for each observer.

            Empty/Never/Throw
                Creates an Observable with limited behavior.


        Type of Observables
        --------------------------------------------------------------------------------------

            Flowable<T>

                    Emits 0 or n items and terminates with an success or an error event. Supports backpressure, which allows to control how fast a source emits items.

            Observable<T>

                    Emits 0 or n items and terminates with an success or an error event.

            Single<T>

                    Emits either a single item or an error event. The reactive version of a method call.

            Maybe<T>

                    Succeeds with an item, or no item, or errors. The reactive version of an Optional.

            Completable

                    Either completes with an success or with an error event. It never emits items. The reactive version of a Runnable.

              Project Reactor       encapsualtion of RxJava2
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

                Flux                    Observable
                Mono                    Single