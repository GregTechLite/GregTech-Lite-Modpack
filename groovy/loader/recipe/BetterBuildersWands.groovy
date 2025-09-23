log.info("Starting to load BetterBuildersWands Recipes...")

// Unbreakable Wands
crafting.removeByOutput(item('betterbuilderswands:wandunbreakable', 12))
crafting.shapedBuilder()
    .name(resource('gtlite:unbreakable_wand'))
    .shape('WWW',
           '   ',
           '   ')
    .key('W', item('betterbuilderswands:wanddiamond'))
    .output(item('betterbuilderswands:wandunbreakable', 12))
    .register()

// Unbreakable Wands II
crafting.removeByOutput(item('betterbuilderswands:wandunbreakable', 13))
crafting.shapedBuilder()
    .name(resource('gtlitecore:unbreakable_wand_2a'))
    .shape('WWW',
           'WWW',
           '   ')
    .key('W', item('betterbuilderswands:wanddiamond'))
    .output(item('betterbuilderswands:wandunbreakable', 13))
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:unbreakable_wand_2b'))
    .shape('WW ',
           '   ',
           '   ')
    .key('W', item('betterbuilderswands:wandunbreakable', 12))
    .output(item('betterbuilderswands:wandunbreakable', 13))
    .register()

// Unbreakable Wands III
crafting.removeByOutput(item('betterbuilderswands:wandunbreakable', 14))
crafting.shapedBuilder()
    .name(resource('gtlite:unbreakable_wand_3a'))
    .shape('WWW',
           'WWW',
           'WWW')
    .key('W', item('betterbuilderswands:wanddiamond'))
    .output(item('betterbuilderswands:wandunbreakable', 14))
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:unbreakable_wand_3b'))
    .shape('WW ',
           '   ',
           '   ')
    .key('W', item('betterbuilderswands:wandunbreakable', 13))
    .output(item('betterbuilderswands:wandunbreakable', 14))
    .register()

crafting.shapedBuilder()
    .name(resource('gtlite:unbreakable_wand_3c'))
    .shape('WWW',
           'W  ',
           '   ')
    .key('W', item('betterbuilderswands:wandunbreakable', 12))
    .output(item('betterbuilderswands:wandunbreakable', 14))
    .register()