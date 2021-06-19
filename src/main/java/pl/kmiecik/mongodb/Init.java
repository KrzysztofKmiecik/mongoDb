package pl.kmiecik.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Init {

    private final ToyRepository repository;

    @Autowired
    public Init(ToyRepository repository) {
        this.repository = repository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void Start() {
        Toy toyTeddy = new Toy("Mis uszatek", ToyType.TEDDY_BEAR);
        Toy toyDoll = new Toy("Lala", ToyType.DOLL);
       /* repository.save(toyTeddy);
        repository.save(toyDoll);*/

        Toy toy = repository.findById("60ce2c26181fea636fa2447a").get();
        toy.setType(ToyType.DOLL);
        repository.save(toy);
        repository.findAll().forEach(System.out::println);

        repository.deleteById(toy.getId());
    }

}

