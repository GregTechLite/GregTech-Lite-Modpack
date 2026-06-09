log.info("Starting to load BetterQuesting Recipes...")

// Questbook
crafting.shapelessBuilder()
    .name(resource('gtlite:questbook'))
    .input([item('minecraft:book'), item('gtlitecore:gtlite_meta_item_2', 13)])
    .output(item('betterquesting:quest_book'))
    .register()