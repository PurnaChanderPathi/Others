package net.javapractice.Springannotations.Controllers;

import net.javapractice.Springannotations.beans.NoteBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.print.Book;
@RestController
@RequestMapping("/api")
//@Controller
//@ResponseBody
public class BookController {
    @RequestMapping("/hello-world")
    //@ResponseBody
    public String helloWorld()
    {
        return "helloPathi";
    }
//  @RequestMapping(value = {"/user-data","/user-info", "user-details"})
//  //@ResponseBody
//    public NoteBook getBook()
//  {
//      NoteBook noteBook = new NoteBook(21 ,"qwertyu" ,"asdfghj" );
//              return noteBook;
//  }

    @GetMapping(value = {"/user-data","/user-info", "user-details"})
    //@ResponseBody
    public NoteBook getBook()
    {
        NoteBook noteBook = new NoteBook(21 ,"qwertyu" ,"asdfghj" );
        return noteBook;
    }
@PostMapping(value = "/books/create", consumes = MediaType.APPLICATION_JSON_VALUE )
@ResponseStatus(value = HttpStatus.CREATED)
    public NoteBook createNotebook(@RequestBody NoteBook noteBook )
    {
        System.out.println(noteBook.getId());
        System.out.println(noteBook.getTitle());
        System.out.println(noteBook.getDescription()); return noteBook;
    }
@PutMapping(value = "/book/update/{id}")
    public ResponseEntity<NoteBook> updateNoteBook (@PathVariable int id, @RequestBody NoteBook updateNoteBook)
    {
        System.out.println(id);
        System.out.println(updateNoteBook.getTitle());
        System.out.println(updateNoteBook.getDescription());
        updateNoteBook.setId(id);
        return ResponseEntity.ok(updateNoteBook);
    }
@DeleteMapping(value = "/book/delete/{id}")
    public ResponseEntity<String> deleteNoteBook(@PathVariable int id)
    {
        System.out.println(id);
        return ResponseEntity.ok("Book Deleted Successfully");
    }
//@GetMapping("/books/{id}/{title}/{description}")
//    public ResponseEntity<NoteBook> pathvariabledemo(@PathVariable int id, @PathVariable String title, @PathVariable String description)
//    {
//        System.out.println(id);
//        NoteBook noteBook = new NoteBook(1,"King Kohli","Running Machine");
//        return ResponseEntity.ok(noteBook);
//    }

    @GetMapping("/books/{id}/{title}/{description}")
    public ResponseEntity<NoteBook> pathvariabledemo(@PathVariable int id, @PathVariable("title") String NoteBookTitle, @PathVariable("description") String NoteBookDescription)
    {
        System.out.println(id);
        NoteBook noteBook = new NoteBook();
        noteBook.setId(id);
        noteBook.setTitle(NoteBookTitle);
        noteBook.setDescription(NoteBookDescription);
        return ResponseEntity.ok(noteBook);
    }
    @GetMapping("/books/query")
    public ResponseEntity<NoteBook> RequestParamDemo(@RequestParam(name = "id") int id,@RequestParam(name = "title") String title,@RequestParam(name ="description") String description)
    {
        System.out.println(id);
        System.out.println(title);
        System.out.println(description);

        NoteBook noteBook = new NoteBook();
        noteBook.setId(id);
        noteBook.setTitle(title);
        noteBook.setDescription(description);

        return ResponseEntity.ok(noteBook);

    }

}