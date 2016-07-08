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

Develop Architectural Templates
-----------------------------------------

1. Download and install [Eclipse Modeling Tools][2]
2. Download and install Eclipse plugin dependencies for Architectural Templates development.
	- Go to Eclipse->Help->Install New Software
	- Add Architectural Templates nightly update site: "http://cloudscale.xlab.si/cse/updatesites/architecturaltemplates/nightly/".
	- Install Architectural Templates feature.
3. Clone repository
	$ git clone https://github.com/PalladioSimulator/Architectural-Templates.git
4. Import Architectural Templates plugins into the workbench.

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
