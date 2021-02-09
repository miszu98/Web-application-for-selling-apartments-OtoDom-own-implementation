package com.portal.otodom.Repositories;

import com.portal.otodom.Models.Offer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CacheRepo {

    private List<Offer> db = new ArrayList<>();

    public void addToCache(Offer offer) {
        db.add(offer);
    }

    public List<Offer> getCache() {
        return db;
    }

    public void clearCache() {
        db = new ArrayList<>();
    }
}
