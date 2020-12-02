# TDT4250 Project - Edit

## Icons

Default icons for EMF projects are defined in `TDT4250Project/TDT4250Project.polet.model.edit/icons/full/obj16/`. Some custom icons have been added to this file, and are used by `TDT4250Project/TDT4250Project.polet.diagram/description/diagram.odesign` to improve the layout of the diagrams.

## File structure

```sh
.
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
