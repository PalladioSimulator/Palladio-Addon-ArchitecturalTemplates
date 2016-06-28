Architectural Templates
=======================
The Architectural Template method is an efficient design-time engineering method for analyzing scalability, elasticity, and efficiency properties of SaaS applications. This method quantifies such properties based on reusable analysis templates — so called Architectural Templates.
We extend the PCM via the the Architectural Template language and provide a catalogue of Architectural Templates specified in this language. Architectural Templates manifest all quality-relevant characteristics intrinsic to given architectural styles, architectural patterns, and reference architecture. Architects only have to fill-in the parts specific to their concrete application.


Eclipse Update Sites
-----------------------------------------

##### Nightly Build
- http://cloudscale.xlab.si/cse/updatesites/architecturaltemplates/nightly/


Architectural Template Catalogue
-----------------------------------------
In CloudScale, we collected Architectural Templates for designing and analyzing scalable, elastic, and efficient SaaS applications.

##### Description for all templates in CloudScale Wiki:
- http://wiki.cloudscale-project.eu/index.php/HowTos

##### Plugin with all template resources:
- org.scaledl.architecturaltemplates.repositories.cloudscale

Example applications of Architectural Templates
-----------------------------------------
##### Feature
- org.scaledl.architecturaltemplates.examples.feature

##### Included Plugins
- org.scaledl.architecturaltemplates.examples.aliceandbob
- org.scaledl.architecturaltemplates.examples.dynscalingassemblycontext
- org.scaledl.architecturaltemplates.examples.dynscalingcontainer
- org.scaledl.architecturaltemplates.examples.dynverticalscaling
- org.scaledl.architecturaltemplates.examples.staticassemblycontext
- org.scaledl.architecturaltemplates.examples.staticresourcecontainer

Develop Architectural Templates
-----------------------------------------

1. Download and install [Eclipse Modeling Tools][1]
2. Download and install Eclipse plugin dependencies for Architectural Templates development.
	- Go to Eclipse->Help->Install New Software
	- Add Architectural Templates nightly update site: "http://cloudscale.xlab.si/cse/updatesites/architecturaltemplates/nightly/".
	- Install Architectural Templates feature.
3. Clone repository
	$ git clone https://github.com/CloudScale-Project/ArchitecturalTemplates.git
4. Import Architectural Templates plugins, under "plugins/" directory, into the workbench.

Core Features of Architectural Templates
-----------------------------------------
##### Features
- org.scaledl.architecturaltemplates.feature
- org.scaledl.architecturaltemplates.buckminster

##### Included Plugins
- org.scaledl.architecturaltemplates
- org.scaledl.architecturaltemplates.edit
- org.scaledl.architecturaltemplates.editor
- org.scaledl.architecturaltemplates.completion.jobs

UI Features of Architectural Templates
-----------------------------------------
##### Features
- org.palladiosimulator.editors.feature

##### Included Plugins
- org.palladiosimulator.editors.composedprovidingrequiringentity.design
- org.palladiosimulator.editors.gmf.runtime.diagram.ui.extension
- org.palladiosimulator.editors.util

[1]: https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/lunasr2
