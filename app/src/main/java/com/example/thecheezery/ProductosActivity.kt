package com.example.thecheezery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductosActivity : AppCompatActivity() {

    private lateinit var recyclerProducts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        recyclerProducts = findViewById(R.id.recyclerProducts)
        recyclerProducts.layoutManager = LinearLayoutManager(this)

        val category = intent.getStringExtra("category")

        val products = when (category) {
            "cold" -> getColdDrinks()
            "hot" -> getHotDrinks()
            "sweets" -> getSweets()
            "salties" -> getSalties()
            else -> emptyList()
        }

        recyclerProducts.adapter = ProductoAdaptador(products)
    }

    private fun getColdDrinks() = listOf(
        Producto("Caramel Frap", R.drawable.caramelfrap, "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", 5),
        Producto("Chocolate Frap", R.drawable.chocolatefrap, "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.", 6),
        Producto("Cold Brew", R.drawable.coldbrew, "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3),
        Producto("Matcha Latte", R.drawable.matcha, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", 4),
        Producto("Oreo Milkshake", R.drawable.oreomilkshake, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", 7),
        Producto("Peanut Milkshake", R.drawable.peanutmilkshake, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7)
    )

    private fun getHotDrinks() = listOf(
        Producto("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk", 6),
        Producto("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5),
        Producto("Espresso", R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4),
        Producto("Chai Latte", R.drawable.chailatte, "Spiced tea concentrate with milk", 6),
        Producto("Capuccino", R.drawable.capuccino, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7),
        Producto("American coffee", R.drawable.americano, "Espresso with hot water", 2)
    )

    private fun getSweets() = listOf(
        Producto("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6),
        Producto("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3),
        Producto("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4),
        Producto("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6),
        Producto("Cherry cheesecake", R.drawable.strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7),
        Producto("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6)
    )

    private fun getSalties() = listOf(
        Producto("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6),
        Producto("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5),
        Producto("Panini", R.drawable.hampanini, "Sandwich made with Italian bread served warmed by grilling.", 4),
        Producto("Philly cheese steak", R.drawable.phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6),
        Producto("Nachos", R.drawable.nachos, "Tortilla chips layered with beef and melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.", 7)
    )
}
