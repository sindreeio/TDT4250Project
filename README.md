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
* [Contributors](#contributors)
* [License](#license)

## About The Project

### Built With
TODO: Build with Eclipse?
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
TODO: Eclipse?
Install guide for plugins if needed in eclipse.
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

## Roadmap
School project,

## Contributors

### Example for folder structure

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

### LICENSE
Distributed under the [MIT](https://opensource.org/licenses/MIT) License.
Tearms of service API?
