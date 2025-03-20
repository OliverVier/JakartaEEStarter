package de.sdo.demo;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.junit.jupiter.api.Test;

class ArchUnitTests {

    @Test
    void useModernDateApi() {
        //classes().that().resideInAPackage("..service..")
        noClasses()
            .should()
            .dependOnClassesThat()
            .areAssignableTo(java.util.Date.class)
            .because("We want to avoid the usage of the legacy Date api as much as possible");
    }

    @Test
    void noPersistenceUsage() {
        noClasses()
            .should().dependOnClassesThat().resideInAnyPackage("javax.persistence..", "jakarta.persistence..")
            .orShould().beAnnotatedWith("javax.persistence.Entity")
            .orShould().beAnnotatedWith("jakarta.persistence.Entity")
            .because("We want this module to take care of frontend responsibilities only");
    }
}
