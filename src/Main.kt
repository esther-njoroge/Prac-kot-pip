fun main(){
    addUsers("user01", listOf("sugar, milk, flour, juice"))
    addUsers("user02", listOf("soap, tissue, washing powder, tooothpaste"))
    println(getRecommendations("user02"))

}

val userPreferences: MutableMap<String, List<String>> = mutableMapOf()

fun addUsers(userId: String, preferredCategories: List<String>) {
    userPreferences[userId] = preferredCategories
}

fun getRecommendations(userId: String) : List<String> {
    val preferredCategories = userPreferences[userId] ?: return emptyList()
    val recommendations = mutableListOf<String>()
    for (category in preferredCategories) {
        recommendations.add("userItems: $category")
        recommendations.add("userItems: $category")
    }
    return recommendations


}