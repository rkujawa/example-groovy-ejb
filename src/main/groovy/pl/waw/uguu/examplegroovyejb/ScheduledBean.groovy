package pl.waw.uguu.examplegroovyejb

import javax.annotation.*
import javax.ejb.*

@Startup
@Singleton
class ScheduledBean {
    @PostConstruct
    initialize(){
        println("Initializing ScheduledBean...")
    }
    
    @Schedule(second="0", minute="*/1", hour="*", info="Every 1 minute")
    public void doThings() {
        println("Doing EJBy things from Groovy, lol")
    }
}
