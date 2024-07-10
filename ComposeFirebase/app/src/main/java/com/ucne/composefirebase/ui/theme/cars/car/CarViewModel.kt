package com.ucne.composefirebase.ui.theme.screens.cars.car

import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.toObject
import com.google.firebase.ktx.Firebase
import com.ucne.composefirebase.domain.Car
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CarViewModel : ViewModel() {

    private var _car = MutableStateFlow<Car?>(null)
    var car = _car.asStateFlow()

    init {
        getCarByID()
    }

    fun getCarByID() {
        val db = Firebase.firestore

        db.collection("cars")
            .document("uQ9C9PzGXxw1ivXm0zZ4")
            .get()
            .addOnSuccessListener { documentSnapshot ->
                _car.value = documentSnapshot.toObject()
            }
    }
}