package com.example.mycityapp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R

class RecommendationViewModel : ViewModel() {

    private val _recommendations = MutableLiveData<List<Recommendation>>()
    val recommendations: LiveData<List<Recommendation>> = _recommendations
    fun loadRecommendations(category: String) {
        val sampleData = when (category) {
            "Coffee Shops" -> listOf(
                Recommendation(
                    "Ala Grande Caffè",
                    "Ala Grande Caffè is a small but charming cafe located in the heart of Florence, Italy. " +
                            "It is known for its delicious coffee and pastries, as well as its friendly and welcoming atmosphere. " +
                            "The cafe is open for breakfast, lunch, and dinner, and it is a popular spot for both locals and tourists." ,
                    R.drawable.esquires_coffee,
                    R.drawable.ec_food1,
                    R.drawable.ec_food2
                ),
                Recommendation(
                    "Ditta Artigianale Via dei Neri Specialty",
                    "Discover the artistry of coffee at Ditta Artigianale Via dei Neri." +
                            "Savor expertly crafted brews made from the finest beans, roasted to perfection." +
                            " Immerse yourself in a cozy ambiance and experience the true essence of Italian coffee culture. " ,
                    R.drawable.pascal_coffee_house,
                    R.drawable.pch_food1,
                    R.drawable.pch_food2
                ),
                Recommendation(
                    "Melaleuca Firenze",
                    "Start your day right with a delicious breakfast or brunch at Melaleuca Firenze.  " +
                            "Indulge in freshly baked pastries, savor aromatic coffee,  " +
                            "and enjoy a laid-back atmosphere by the Arno River.  " +
                            "It's the perfect spot to unwind and soak up the Florentine lifestyle. ",
                    R.drawable.jungle_cafe_galway,
                    R.drawable.jcg_food1,
                    R.drawable.jcg_food2
            )

            )
            "Restaurants" -> listOf(
                Recommendation(
                    "Ristorante Lorenzo de’ Medici",
                    "Immerse yourself in the heart of Florence’s culinary heritage at Ristorante Lorenzo de’ Medici. " +
                            "and contemporary flair, offering a cozy atmosphere with a menu that " +
                            "celebrates locally sourced ingredients. It's the perfect spot for those " +
                            "seeking both comfort and creativity in their dining experience. ",
                    R.drawable.john_keogh_s_gastropub,
                    R.drawable.jkg_food1,
                    R.drawable.jkg_food2
                ),
                Recommendation(
                    "La Prosciutteria Firenze",
                    "It is a cozy, vibrant eatery that combines modern Irish cuisine with a " +
                            "warm, welcoming atmosphere. Known for its fresh, locally sourced ingredients, " +
                            "it offers a menu that blends traditional flavors with contemporary twists. ",
                    R.drawable.the_quay_street_kitchen,
                    R.drawable.qsk_food1,
                    R.drawable.qsk_food2
            ),
                Recommendation(
                    "La Bottega",
                    "On the Pier offers a cozy and scenic dining experience " +
                            "right by the water's edge in Limerick. Known for its fresh, locally " +
                            "sourced seafood and inviting atmosphere, it’s a hidden gem perfect for " +
                            "enjoying a relaxing meal with a view. ",
                    R.drawable.o_grady_s_on_the_pier,
                    R.drawable.ogp_food1,
                    R.drawable.ogp_food2
                ),
            )
            "Parks" -> listOf(
                Recommendation(
                    "Giardino del Bobolino",
                    "a vibrant hub where local vendors and artisans " +
                            "come together to offer an eclectic mix of fresh produce, handmade " +
                            "crafts, and tasty street food. Set against the backdrop " +
                            "historic streets, the market buzzes with energy,providing a true " +
                            "taste of the city’s creativity and culture.",
                    R.drawable.galway_market,
                    R.drawable.gm_shop1,
                    R.drawable.gm_shop2
                ),
                Recommendation(
                    "Giardino delle Rose",
                    "Tiny Traders Village in Galway is a vibrant, community-focused " +
                            "marketplace showcasing local artisans, crafters, and food vendors. Known " +
                            "for its eclectic mix of handmade goods, art, vintage items, and delicious " +
                            "street food, it offers a unique and creative shopping experience.",
                    R.drawable.tiny_traders_village,
                    R.drawable.ttv_shop1,
                    R.drawable.ttv_shop2
                ),
                Recommendation(
                    "Giardino Don Renzo Forconi",
                    "The Claddagh Ring Museum in Galway celebrates the history of the iconic " +
                            "Claddagh ring, a symbol of love, loyalty, and friendship. Visitors can " +
                            "learn about their origins, and see demonstrations of traditional Irish " +
                            "jewelry-making.",
                    R.drawable.the_claddagh_ring_museum,
                    R.drawable.crm_shop1,
                    R.drawable.crm_shop2
                )
            )
            "Tourist Spots" -> listOf(
                Recommendation(
                    "Piazzale Michelangelo",
                    "The Corrib Princess is a scenic cruise boat that offers a relaxing " +
                            "journey along the River Corrib and Lough Corrib in Galway, Ireland. It " +
                            "provides stunning views of Galway’s countryside, historical landmarks, " +
                            "and wildlife.",
                    R.drawable.corrib_princess,
                    R.drawable.cp_tour1,
                    R.drawable.cp_tour2
                ),
                Recommendation(
                    "Cathedral of Santa Maria del Fiore",
                    "A day trip to the Cliffs of Moher from Galway offers breathtaking views " +
                            "of Ireland's rugged coastline. Visitors can enjoy scenic walks, learn " +
                            "about the area's history at the visitor center, and experience the wild " +
                            "charm of the country.",
                    R.drawable.day_trip_to_the_cliffs_of_moher,
                    R.drawable.cm_tour1,
                    R.drawable.cm_tour2
                ),
                Recommendation(
                    "Uffizi Galleries",
                    "It features lush greenery, historical monuments, and artistic sculptures, " +
                            "including the iconic Browne Doorway and Galway Hooker sails. A walk through " +
                            "Eyre Square offers a mix of modern urban life shops, and street performers " +
                            "creating a lively atmosphere.",
                    R.drawable.walk_through_eyre_square,
                    R.drawable.es_tour1,
                    R.drawable.es_tour2
                )
            )
            else -> emptyList()
        }
        _recommendations.value = sampleData
    }
}
