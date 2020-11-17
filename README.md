# TDT4250 Project

[![](https://img.shields.io/badge/Editor-Eclipse-informational?style=flat&logo=eclipse-ide&logoColor=white&color=2bbc8a)](https://www.eclipse.org/)
[![](https://img.shields.io/badge/Code-Java-informational?style=flat&logo=java&logoColor=white&color=2bbc8a)](https://www.java.com/en/)
[![](https://img.shields.io/badge/Code-Json-informational?style=flat&logo=json&logoColor=white&color=2bbc8a)](https://www.json.org/json-en.html)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![](https://img.shields.io/maintenance/no/2020)

## Table of Contents
* [About the Project](#about-the-project)
  * [Built With](#built-with)
    * [Libraries](#libraries)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [File Structure](#file-structure)
* [Contributors](#contributors)
* [License](#license)

## About The Project
This project is part of the course TDT4250 - Advanced Software Design in 2020 at NTNU.
Our task was to build a DSL that is usable in Eclipse by using frameworks such as Xtext, Sirius or EMF Forms.
We decided to collect data from Vinmonopolet's API and create a model with Ecore. In addition we decided to add a model for recipes to connect 
some of the products from Vinmonopolet to a specific meal. By implementing a transformation for the API, we were able to import and view the data by using EMF. The user interface is created with Sirius and can be installed into Eclipse.

### Built With
Everyone that contributed to the project used Eclipse to develop this software. The next section has a list of libraries that have been used in this project. The names are linked to one of the developers home page for the library.    

#### Libraries
* [Eclipse EMF](https://www.eclipse.org/modeling/emf/)  
* [Sirius](https://www.eclipse.org/sirius/)  
* [Acceleo](https://www.eclipse.org/acceleo/)  
* [Apache HTTP Client](http://hc.apache.org/httpcomponents-client-4.5.x/index.html)  
* [Google GSON](https://github.com/google/gson)   

## Getting Started
TODO: An overall description.
See each bundle directories for more specific instructions.

### Prerequisites
To install this project you would need to install [Eclipse](https://www.eclipse.org/).  
TODO: Install guide for plugins if needed in eclipse.
Extra guide if they are missing.  
```Project-folder -> META-INF -> MANIFEST.MF```

### Installation
To download the project follow these instructions:
```sh
cd /to-your-desired-directory
git clone https://github.com/sindreeio/TDT4250Project.git
cd TDT4250Project
```
Add Plugins...

## Usage
TODO: General usage

For a detailed description on how to use each bundle, check the bundles git directory.

## Roadmap
We have no further plans for this school project. Until there are changes to our roadmap, this project will have no maintenance of the code as of 1. December 2020.

## File structure
This is a view of the file structure for this repository.

```sh
.
├── README.md
├── TDT4250Project.polet.diagram
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── README.md
│   ├── build.properties
│   ├── description
│   │   └── diagram.odesign
│   ├── plugin.properties
│   ├── plugin.xml
│   └── src
│       └── TDT4250Project
│           └── polet
│               └── diagram
│                   ├── Activator.java
│                   └── Services.java
├── TDT4250Project.polet.diagram.example
│   ├── Categories.xmi
│   ├── README.md
│   └── representations.aird
└── TDT4250Project.polet.model
    ├── META-INF
    │   └── MANIFEST.MF
    ├── README.md
    ├── build.properties
    ├── model
    │   ├── polet.ecore
    │   └── polet.genmodel
    ├── plugin.properties
    ├── plugin.xml
    └── src
        └── polet
            ├── Categories.java
            ├── Country.java
            ├── MealType.java
            ├── PoletFactory.java
            ├── PoletPackage.java
            ├── Product.java
            ├── ProductOfTypeInMealType.java
            ├── ProductOfTypeInRegion.java
            ├── ProductType.java
            ├── Recipe.java
            ├── Region.java
            ├── impl
            │   ├── CategoriesImpl.java
            │   ├── CountryImpl.java
            │   ├── MealTypeImpl.java
            │   ├── PoletFactoryImpl.java
            │   ├── PoletPackageImpl.java
            │   ├── ProductImpl.java
            │   ├── ProductOfTypeInMealTypeImpl.java
            │   ├── ProductOfTypeInRegionImpl.java
            │   ├── ProductTypeImpl.java
            │   ├── RecipeImpl.java
            │   └── RegionImpl.java
            └── util
                ├── Constants.java
                ├── DataGenerator.java
                ├── PoletAdapterFactory.java
                ├── PoletResourceFactoryImpl.java
                ├── PoletResourceImpl.java
                ├── PoletSwitch.java
                └── PoletValidator.java
```

## Contributors
[<img src="https://github.com/sindreeio.png?size=50" alt="" data-canonical-src="" width="50" height="50" />](https://github.com/sindreeio)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[<img src="https://github.com/Magwest1.png?size=50" alt="" data-canonical-src="" width="50" height="50" />](https://github.com/Magwest1)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[<img src="https://github.com/aspleym.png?size=50" alt="" data-canonical-src="" width="50" height="50" />](https://github.com/aspleym)

### LICENSE
Distributed under the [MIT](https://opensource.org/licenses/MIT) License.
To use Vinmonopolet's API, you would need to read and accept their [Terms of service](https://apimgmtstxpwulwcbypzj5uz.blob.core.windows.net/content/MediaLibrary/Terms/API%20Vinmonopolet%20-%20Terms%20of%20service.pdf).
