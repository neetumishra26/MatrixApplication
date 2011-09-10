grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolution = {

    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
//        mavenLocal()
//        mavenCentral()
//        mavenRepo "http://snapshots.repository.codehaus.org"
//        mavenRepo "http://repository.codehaus.org"
//        mavenRepo "http://download.java.net/maven/2/"
//        mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        test "org.seleniumhq.selenium:selenium-firefox-driver:2.4.0"

//        test 'org.seleniumhq.selenium:selenium-chrome-driver:latest.release'
//        test 'org.seleniumhq.selenium:selenium-ie-driver:latest.release'
        test 'org.codehaus.geb:geb-spock:0.6.0'
//        test('org.seleniumhq.selenium:selenium-htmlunit-driver:latest.release') {
//        exclude 'xml-apis'
//        }
    }
}
