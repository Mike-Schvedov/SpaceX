# SpaceX
A simple MVVM application, that gets data from the SpaceX API using retrofit and stores it into the local Room Database.<br>
Then the data is fetched from the Database and displayed on the UI. (This way the app will keep working without internet connection).<br>
A Work Manager checks for new updates every 24 hours, updates the database if there is new data and notifies the user with a notification.<br>
It is a single activity app with 4 fragments, built with Dependency Injection, Flows (transfering data between layers), LiveData (updating the UI) and Coroutines.<br>


![Screenshot 2022-07-28 113245](https://user-images.githubusercontent.com/100552525/181461422-58a02df7-6e20-48ff-833c-bc1a309c0f4f.png)


![Screenshot 2022-07-28 121057](https://user-images.githubusercontent.com/100552525/181468382-68da0ecc-cdce-434a-bd03-b0d90b103370.png)


![Screenshot 2022-07-28 130456](https://user-images.githubusercontent.com/100552525/181480548-0c8c94bb-d5bc-4bcf-9ea3-4f1a253cd9d9.png)
