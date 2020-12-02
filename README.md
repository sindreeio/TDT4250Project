# TDT4250 Project

[![](https://img.shields.io/badge/Editor-Eclipse-informational?style=flat&logo=eclipse-ide&logoColor=white&color=2bbc8a)](https://www.eclipse.org/)
[![](https://img.shields.io/badge/Code-Java-informational?style=flat&logo=java&logoColor=white&color=2bbc8a)](https://www.java.com/en/)
[![](https://img.shields.io/badge/Code-Json-informational?style=flat&logo=json&logoColor=white&color=2bbc8a)](https://www.json.org/json-en.html)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![](https://img.shields.io/maintenance/no/2020)

## Table of Contents

- [About the Project](#about-the-project)
  - [Built With](#built-with)
    - [Libraries](#libraries)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Roadmap](#roadmap)
- [File Structure](#file-structure)
- [Contributors](#contributors)
- [License](#license)

## About The Project

This project is part of the course TDT4250 - Advanced Software Design in 2020 at NTNU.
Our task was to build a DSL that is usable in Eclipse by using frameworks such as Xtext, Sirius or EMF Forms.
We decided to collect data from Vinmonopolet's API and create a model with Ecore. In addition we decided to add a model for recipes to connect
some of the products from Vinmonopolet to a specific meal. By implementing a transformation for the API, we were able to import and view the data by using EMF. The user interface is created with Sirius and can be installed into Eclipse.

### Built With

Everyone that contributed to the project used Eclipse to develop this software. The next section has a list of libraries that have been used in this project. The names are linked to one of the developers home page for the library.

#### Libraries

- [Eclipse EMF](https://www.eclipse.org/modeling/emf/)
- [Sirius](https://www.eclipse.org/sirius/)
- [Acceleo](https://www.eclipse.org/acceleo/)
- [Apache HTTP Client](http://hc.apache.org/httpcomponents-client-4.5.x/index.html)
- [Google GSON](https://github.com/google/gson)

## Getting Started

### Prerequisites

To install this project you would first need to install [Eclipse](https://www.eclipse.org/).

### Download project

This section will guide you to clone this git repository. Type the following lines in the terminal (for **_unix_** users):

```sh
cd /to-your-desired-directory
git clone https://github.com/sindreeio/TDT4250Project.git
cd TDT4250Project
```

You are now inside the project folder.

Type `ls` in the terminal to see the root folder structure.

### Adding the project to Eclipse

In this section you will be guided step by step on how to add this project to your Eclipse workspace.

- Start by launching a new worskpace in Eclipse.
- In the menu, press: `File -> Import...`
- A new window should open. Click on the folder named `Git`, select `Projects from Git` and hit the button named `Next >`.
- Select: `Existing local repository` and proceed by pressing the `Next >` button.
- There should be a button with the name `Add...` to add a git repository.
  - Another window will pop up. Type in the path to the git project's directory, or use the `Browse...` button to find the path.
  - In the search results, check the box for the git project you want to add to your workspace. The directory should look something like `/you-directory/TDT4250Project/.git`.
  - Press the `Finish` button to close the window, and the `Next >` button to proceed.
- You should now see how the working tree will look like when you import the project. No changes should be needed, proceed by clicking the `Next >` button.
- The next window will show you the different projects that will be added to the workspace. Just hit the `Finish` button to finalize the import.
- The Project should now be imported into Eclipse and you can view each bundle in the _Package Explorer_.

## Usage

The project is separated into several bundles.

- **_Model_**: This bundle contains the Ecore model and the generator for downloading and structuring the data which is used with the diagram.
- **_Diagram.example_**: An example bundle for initalizing the diagrams from the _diagram bundle_ with the data from the _model bundle_.
- **_Diagram_**: The diagrams' source code can be viewed and edited in this bundle.
- **_Model.edit_**: A bundle for defining custom icons for your diagrams.

We **_suggest_** viewing each bundle in order above for a more detailed description on how to use each bundle.
You can decide to ignore the two last bundles unless you want to change some of the source code for the diagrams.

## Roadmap

We have no further plans for this school project. Until there are changes to our roadmap, this project will have no maintenance of the code as of 1. December 2020.

## File structure

This is an overview of the file structure for this repository.

```sh
.
├── README.md
├── TDT4250Project.polet.diagram
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── README.mds
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
├── TDT4250Project.polet.model
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── README.md
│   ├── build.properties
│   ├── model
│   │   ├── categories.xmi
│   │   ├── data.json
│   │   ├── polet.ecore
│   │   └── polet.genmodel
│   ├── plugin.properties
│   ├── plugin.xml
│   └── src
│       └── polet
│           ├── Categories.java
│           ├── Country.java
│           ├── MealType.java
│           ├── PoletFactory.java
│           ├── PoletPackage.java
│           ├── Product.java
│           ├── ProductOfTypeInMealType.java
│           ├── ProductOfTypeInRegion.java
│           ├── ProductType.java
│           ├── Recipe.java
│           ├── Region.java
│           ├── impl
│           │   ├── CategoriesImpl.java
│           │   ├── CountryImpl.java
│           │   ├── MealTypeImpl.java
│           │   ├── PoletFactoryImpl.java
│           │   ├── PoletPackageImpl.java
│           │   ├── ProductImpl.java
│           │   ├── ProductOfTypeInMealTypeImpl.java
│           │   ├── ProductOfTypeInRegionImpl.java
│           │   ├── ProductTypeImpl.java
│           │   ├── RecipeImpl.java
│           │   └── RegionImpl.java
│           └── util
│               ├── Constants.java
│               ├── DataGenerator.java
│               ├── PoletAdapterFactory.java
│               ├── PoletResourceFactoryImpl.java
│               ├── PoletResourceImpl.java
│               ├── PoletSwitch.java
│               └── PoletValidator.java
└── TDT4250Project.polet.model.edit
    ├── META-INF
    │   └── MANIFEST.MF
    ├── README.md
    ├── build.properties
    ├── icons
    │   └── full
    │       ├── ctool16
    │       │   ├── CreateCategories_countries_Country.gif
    │       │   ├── CreateCategories_mealTypes_MealType.gif
    │       │   ├── CreateCategories_productTypes_ProductType.gif
    │       │   ├── CreateCountry_regions_Region.gif
    │       │   └── CreateRegion_products_ProductOfTypeInRegion.gif
    │       └── obj16
    │           ├── Categories.gif
    │           ├── Country.gif
    │           ├── MealType.gif
    │           ├── ProductOfTypeInMealType.gif
    │           ├── ProductOfTypeInRegion.gif
    │           ├── ProductType.gif
    │           ├── Recipe.gif
    │           ├── Region.gif
    │           ├── country.png
    │           ├── mealTypeSmall.png
    │           ├── product.png
    │           ├── productType.png
    │           ├── recipe.png
    │           └── region.png
    ├── plugin.properties
    ├── plugin.xml
    └── src
        └── polet
            └── provider
                ├── CategoriesItemProvider.java
                ├── CountryItemProvider.java
                ├── MealTypeItemProvider.java
                ├── PoletEditPlugin.java
                ├── PoletItemProviderAdapterFactory.java
                ├── ProductItemProvider.java
                ├── ProductOfTypeInMealTypeItemProvider.java
                ├── ProductOfTypeInRegionItemProvider.java
                ├── ProductTypeItemProvider.java
                ├── RecipeItemProvider.java
                └── RegionItemProvider.java
```

## Contributors

[<img src="https://github.com/sindreeio.png?size=50" alt="" data-canonical-src="" width="50" height="50" />](https://github.com/sindreeio)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[<img src="https://github.com/Magwest1.png?size=50" alt="" data-canonical-src="" width="50" height="50" />](https://github.com/Magwest1)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[<img src="https://github.com/aspleym.png?size=50" alt="" data-canonical-src="" width="50" height="50" />](https://github.com/aspleym)

## LICENSE

Distributed under the [MIT](https://opensource.org/licenses/MIT) License.
To use Vinmonopolet's API, you would need to read and accept their [Terms of service](https://apimgmtstxpwulwcbypzj5uz.blob.core.windows.net/content/MediaLibrary/Terms/API%20Vinmonopolet%20-%20Terms%20of%20service.pdf).
