<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px" />

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](http://www.rultor.com/b/objectionary/eo)](http://www.rultor.com/p/objectionary/eo)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

![Lines of code](https://img.shields.io/tokei/lines/github/objectionary/eo-intellij-plugin)
![Hits-of-Code](https://hitsofcode.com/github/objectionary/eo-intellij-plugin)
![Build](https://img.shields.io/github/workflow/status/objectionary/eo-intellij-plugin/Java%20CI)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/objectionary/eo/blob/master/LICENSE.txt)
# eo-intellij-plugin

This is Intellij plugin for **[eo language](https://github.com/objectionary/eo)**. Plugin is implemented on Java and ANTLR4 grammar.

 **[ANTLR 4 adapter](https://github.com/antlr/antlr4-intellij-adaptor)** was used for generating lexer and parser classes.
First version contains syntax highlighting

## Usage
Installing is possible from IDEA. Type 'EO' in plugins search tab.

You may also install plugin from **[eo plugin page](https://plugins.jetbrains.com/plugin/19256-eo/versions)**
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.

## Structure
Project has two parts: manually written and auto-generated.

In `src/main` you may find source code. Classes listed there are not autogenerated. They describe EO language and .eo extension

Second part is auto-generated classes. They should be generated from .g4 file and moved into 
`java/org/eolang/jetbrains/parser`. Grammar will be downloaded automatically during build gradle task. Needed class will be 
generated at the same time. 

Resources (icons and plugin.xml) are located in `src/resources`.


## Publishing
**Note that first publishing HAS TO be manually. `publishPlugin` gradle task will work only for later releases.**

The easiest and most automatically way to publish plugin from terminal is described below.
1. **Building** (generates zip and puts it here `build/distributions`)
    
    Don't forget to change version in plugin.xml and gradle.properties!
    
    Run `buildPlugin`
   
    First time you should send zip archive manually to **[JetBrains Marketplace](https://plugins.jetbrains.com)**
2. **Publishing**
    
    You will need to get private token here **[JetBrains Marketplace](https://plugins.jetbrains.com)** 
    
    Then run `export MARKETPLACE_TOKEN=<your token>` 
    
    Then just run `publishPlugin` gradle task, zip archive will be pushed automatically.


We use **[rultor](https://github.com/yegor256/rultor)** for publishing (see .rultor.yml)

## How it looks
<img src="https://i.ibb.co/4RGCqKD/2022-06-24-16-47-36.png"/>

You may set your own highlighting colors


## License
[MIT](https://choosealicense.com/licenses/mit/)