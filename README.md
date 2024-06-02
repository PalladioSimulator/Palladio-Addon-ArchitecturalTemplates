Architectural Templates
=======================
The Architectural Template method is an efficient design-time engineering method for analyzing scalability, elasticity, and efficiency properties of SaaS applications. This method quantifies such properties based on reusable analysis templates — so called Architectural Templates.
We extend the PCM via the the Architectural Template language and provide a catalogue of Architectural Templates specified in this language. Architectural Templates manifest all quality-relevant characteristics intrinsic to given architectural styles, architectural patterns, and reference architecture. Architects only have to fill-in the parts specific to their concrete application.


Eclipse Update Sites
-----------------------------------------

##### Latest Build
- https://sdqweb.ipd.kit.edu/eclipse/architecturaltemplates/releases/latest/

##### Nightly Build
- https://sdqweb.ipd.kit.edu/eclipse/architecturaltemplates/nightly/


Architectural Template Catalogue
-----------------------------------------
We provide a default Architectural Template Catalogue with formalizations of commonly used architectural styles, architectural patterns, and reference architectures.

##### Description for all Architectural Templates in CloudScale Wiki:
- http://wiki.cloudscale-project.eu/index.php/HowTos

##### Plugin with all template resources:
- org.palladiosimulator.architecturaltemplates.catalog

Editor Integration of Architectural Templates
-----------------------------------------

The [Sirius-based editors][1] for the Palladio Component Model fully support the applycation of Architectural Templates.


Example applications of Architectural Templates
-----------------------------------------
##### Feature
- org.palladiosimulator.architecturaltemplates.examples.feature

##### Included Plugins
- org.palladiosimulator.architecturaltemplates.examples.*

## Documentation
### Getting Started
The current release of Palladio comes with all required Plug-Ins and dependences. So, if you follow the guide to install Palladio (PCM >= 4.0) you should be ready to use (A)rchitectural (T)emplates.

In case you want to use the graphical editor support, make sure you use the new Sirius Editors.

#### Requirements to use ATs
* ATs currently only work with experiment automation
* You need to use Simulizar

#### Learn How to Use ATs
There is a step by step guide available, which allows you to learn the fundamentals of Palladio's performance predictions and how to apply AT's to your model. The guide will teach you how to use ATs on the example of a load balancer.

## Creating a new Architectural Template in Palladio
Prerequisites:
* EMF Profiles Diagram Editor: Install Emf Profiles Sirius Editor in Eclipse
* Clone Architectural Templates git repository

### Creating a EMF-Profile for the new AT
#### 1. Creating the profile

![AtGuide_emfprofile_creation](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/e7544a42-300e-418a-9d18-f8107a023fa4)

Then click on browse to specify where you want to save your emfprofile diagram. Normally it goes into the profiles folder of the AT catalog(..architecturaltemplates.catalog/profiles/). You may have to select the profiles folder and Right-Click->Refresh before the new emfprofile diagram appears.

#### 2. Setting the right properties
Open the new emfprofile (by default with the EMF Profile Diagram Editor which should be installed as described in Prerequisites). Select the Property view and set properties:

* Set Name as YOURNAME+"Profile" e.g. ParallelLoopProfile
* Ns Prefix as "org.palladiosimulator.architecturaltemplates.catalog.profiles"
* Ns URI as "org.palladiosimulator.architecturaltemplates.catalog.profiles.YOURNAME"
* Click inside the diagram editor and save the changes!

![AtGuide_emfprofile_setProperties](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/67dbf136-c4c9-424f-a2aa-44fd2be698d6)

#### 3. Register the profile in plugin.xml
Now you have to register the profile in `plugin.xml`: 
1. Open the Plugin XML-File with the Plug-in Manifest Editor and select the plugin.xml tab (alternatively open it with a Text Editor).
2. Customize and append the following lines to your `plugin.xml` file: 
```
<extension point="org.modelversioning.emfprofile.profile">
    <profile profile_resource="profiles/YourName.emfprofile_diagram"/>
</extension>
```

Save the plugin.xml

![AtGuide_emfprofile_registration](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/64af7c4e-6ed9-4c1a-873a-1c7d59180e26)

To check if your profile was registered correctly you can open the Registered EMF Profiles View with Window-> Show View-> Other..-> Registered EMF Profiles(You may have to restart eclipse after registering in plugin.xml before the new EMF Profile is recognized and displayed in the Registered EMF Profiles View).

#### 4. Editing the profile
First you need to import the meta-model you want to use. Right-click inside the emfprofile_diagram and select "Import Metamodel Element..", then search for PalladioComponentModel.

![AtGuide_emfprofile_selectMetamodel](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/536c2508-a6bb-4b5b-9505-b4281e0f060e)
![AtGuide_emfprofile_selectMetamodel2](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/2c692412-54d5-4545-b12c-66d1fe56dbde)
 
Then select the component you want to extend. After that you can model your profile as you like.

**Hint**: use the "Import Metamodel Element.." feature and it generates all ESuper Types for you. You may miss some ESuper Types by changing the ESuper Types in Properties by your own

Sometimes it's not possible to "Import Metamodel Element..." because you can't add your desired Element, because "Invalid referenced element is selected" shows up. This is currently a bug. A current workaround is just to generate a new empty emfProfile as shown in step 1. Then after the new empty emfprofile diagramm is loaded into the editor immediately move back to your old emfprofile diagramm and try to "Import Metamodel Element..." again. The newly created emfProfile_diagram can be deleted afterwards.



### Creating the AT
Open Default.architecutraltemplates (by default with Architectrualtemplates Model Editor) and select the Selection Tab. Expand the tree and select Catalog Default AT Catalog and execute the following steps:

1. Right-click -> New Child-> AT
2. Select the newly added AT. Switch to properties tab and change the Entity Name as you like.
3. Right-click on the new AT -> New Child->Role
4. Drag and drop your previously created emfprofile diagram into the AT Editor.
5. Expand the emfprofile diagram inside the AT Editor and select "YourProfileName"
   
![AtGuide_catalog_dragDropEmfProfile](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/8286a458-e798-4c7f-b964-618285cf8da2)

7. Right-Click->New Child->eAnnotation

8. Select the eAnnotation, then switch to the Properties View and edit Source Property to "org.palladiosimulator.architecturaltemplate"

![AtGuide_catalog_eAnnotation](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/ad47209d-0676-482a-ad9c-5134ca420655)

8. Select the newly created eAnnotation. Right-click->new Child->Details Entry

9. Select Details Entry then switch to the Properties View and set the following properties: Key=AT; Value=platform:/plugin/org.palladiosimulator.architecturaltemplates.catalog/Default.architecturaltemplates#ID_OF_YOUR_AT (the ID can be found in the Properties View of the previously createed AT)

![AtGuide_catalog_detailsEntry](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/46da55a4-35db-404f-a49b-9508e8a5a735)
![AtGuide_catalog_AtKey_retrieval](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/f55098d8-a531-4e51-8705-27c5029d5f1c)

10. Now select the Role which you created in step 3 inside your AT. Switch to the Properties View and change Stereotype to your Stereotype which was defined in your emfprofile diagram. The Stereotype should now appear inside the selection. (Append new roles to the AT for each Stereotype from your emfprofile diagram and set the right Stereotype in the Properties View)

![AtGuide_catalog_multipleRoles](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/37bb20b3-f470-4e97-8519-ea276de4b7ab)

11. Add qvto for each role if needed by Right-click on the Role -> New Cild -> QVTO Completion. Switch to the Properties View of the new QVTO Completion and set Completion File URI to the name of your qvto file. Right-Click on your new QVTO Completion -> new Child -> PCM Blackboard Completion Parameter Rght-Click on your new PCM Blackboard Completion Parameter -> new Child -> PCM File Extension Switch to the Properties View of the new PCM File Extension. Now you can select which Model you want to pass to your qvto by assigning it to File Extension. Which Model you select is dependent on your emfprofile_diagramm and qvto.

![AtGuide_catalog_qvto_passedModel](https://github.com/PalladioSimulator/Palladio-Addons-ParallelPerformanceCatalogue/assets/58919977/d3083d41-2c5b-434c-9151-3a4175dad9cb)

12. Click Inside the Default.architecturetemplate editor and save it. Your AT should be successfully created.

### Known bugs
If your stereotype extends the Class System the name of the stereotype you define in the EMF-Profile MUST end with "...System". Otherwise Palladio won't recognize it.
### Further Documentation
Examples: [CloudScale Architectural Template Examples](http://wiki.cloudscale-project.eu/wiki/index.php/CloudScale_Architectural_Templates)

Documentation & Development: [Architectural Templates](https://github.com/PalladioSimulator/Architectural-Templates)

Conceptual documentation: [Dissertation of Sebastian Lehrig](https://www.ksp.kit.edu/download/1000079766)

### Extensions
Architectural templates for microservice architecture patterns (such as the Circuit Breaker pattern) are available at [https://github.com/PalladioSimulator/Palladio-Addon-ArchitecturalTemplates/tree/Microservices-AT](https://github.com/PalladioSimulator/Palladio-Addon-ArchitecturalTemplates/tree/Microservices-AT) (Master thesis by Matthias Rombach, supervised by Jörg Henß and Christian Stier).

Core Features of Architectural Templates
-----------------------------------------
##### Features
- org.palladiosimulator.architecturaltemplates.feature
- org.palladiosimulator.architecturaltemplates.buckminster

##### Included Plugins
- org.palladiosimulator.architecturaltemplates
- org.palladiosimulator.architecturaltemplates.api
- org.palladiosimulator.architecturaltemplates.edit
- org.palladiosimulator.architecturaltemplates.editor
- org.palladiosimulator.architecturaltemplates.jobs
- org.palladiosimulator.architecturaltemplates.ocl
- org.palladiosimulator.architecturaltemplates.ui

[1]: https://github.com/PalladioSimulator/Palladio-Editors-Sirius
[2]: https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/lunasr2
