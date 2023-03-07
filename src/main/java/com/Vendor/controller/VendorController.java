package com.Vendor.controller;

import com.Vendor.entity.Vendor;
import com.Vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VendorController {

    @Autowired
    VendorRepository br;

    @PostMapping("/savevendor")
    public String saveVendor(@RequestBody Vendor v)
    {
        System.out.println(v.getVendorId());
        System.out.println(v.getVendorName());
        System.out.println(v.getCode());
        System.out.println(v.getAddress());
        System.out.println(v.getCity());
        System.out.println(v.getState());
        System.out.println(v.getPhone());
        System.out.println(v.getPincode());
        System.out.println(v.getEmailAddress());
        br.save(v);
        return "saved successfully";
    }
    @GetMapping("/getvendor")
    public Vendor getVendor(@RequestParam int vendorid)
    {
        Optional<Vendor> vd = br.findById(vendorid);
        return vd.get();
    }

    @GetMapping("/getvendors")
    public List<Vendor> getAllVenor()
    {
        return br.findAll();
    }

    @PutMapping("/updatevendor")
    public String updateVendor(@RequestBody Vendor v)
    {
        br.save(v);
        return "Data Updated Successfully";
    }

    @DeleteMapping("/getuseress")
    public String deleteUser(@RequestParam int id)
    {
        br.deleteById(id);
        return "Data Deleted Successfully";
    }

    }

