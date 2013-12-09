grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		grailsPlugins()
		mavenCentral()
	}

	plugins {

		runtime ":asset-pipeline:1.2.1"


		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
