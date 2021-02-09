package com.portal.otodom.Services;

import com.portal.otodom.Models.Offer;
import com.portal.otodom.Repositories.CacheRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CacheOfferService {

    private CacheRepo cacheRepo;

    public CacheOfferService(CacheRepo cacheRepo) {
        this.cacheRepo = cacheRepo;
    }

    public void addToCache(Offer offer) {
        cacheRepo.addToCache(offer);
    }

    public List<Offer> getCache() {
        return cacheRepo.getCache();
    }

    public void clearCache() {
        cacheRepo.clearCache();
    }

}
