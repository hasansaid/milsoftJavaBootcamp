package com.example.springopm2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    // @Autowired etkisi yapar..
    private SupplierRepository supplierRepository;
    SupplierController(SupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }

    /*@GetMapping("/getall")
    public List<Supplier> getAll(){
        return (List<Supplier>) supplierRepository.findAll();
    }*/

    @GetMapping("/add")
    public String  addSupplier() {
        Supplier supplier = new Supplier(0,"Ali Manço",3690);
        supplierRepository.save(supplier);
        return  "Added --> ID: "+supplier.getSupplierId() + " NAME: " + supplier.getSupplierName();
    }

    @GetMapping("/list")
    public String getSupplier(){
        int count=0;
        for (Supplier supplier:supplierRepository.findAll()
             ) {
            System.out.println(supplier.getSupplierName());
            count++;
        }
        return "Bağlayıcı sayısı : " + count;
    }
    @GetMapping("/totalcreditmin/{totalcreditmin}")
    public String getTotalMinCredit(@PathVariable("totalcreditmin") double totalCreditMin){
        for (Supplier supplier:supplierRepository.findByTotalCreditMin(totalCreditMin)
             ) {
            System.out.println(supplier.getTotalCredit());
            //return supplier.getSupplierName();
        }
        return "Eklendi: " + totalCreditMin;
    }
    @GetMapping("/find/{id}")
    public  String findSupplier(@PathVariable("id") long supplierId){
       Optional<Supplier> optional =supplierRepository.findById(supplierId);
       if (optional.isPresent()){
           Supplier supplier = optional.get();
           return supplier.getSupplierName();
       }
       return "Sağlayıcı bulunamadı";
    }

    @GetMapping("/findthrow/{id}")
    public  String findThrow(@PathVariable("id") long supplierId){
        return supplierRepository.findById(supplierId).map(supplier -> supplier.getSupplierName())
                .orElseThrow(()-> new IllegalArgumentException("Sağlayıcı bulunamadı: "+supplierId));
    }




}
