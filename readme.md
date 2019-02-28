### multi module maven project with JaCoCo

# I need to use JaCoCo to send coverage result (an xml file) to SonarQube. This [line](https://github.com/acntech/jacoco-multimodule-maven) helps me a lot.
But not intended to be use with xml as it's send the jacoco.exec file. Originate from that repository I made this work. Hope this is helpful.

aggregate is a fake module which is useful to call report-aggregate to get a report of all the jacoco.execs.