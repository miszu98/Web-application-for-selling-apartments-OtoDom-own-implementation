package com.portal.otodom.Services;

import com.portal.otodom.Models.Offer;
import com.portal.otodom.Repositories.OfferRepo;
import org.springframework.stereotype.Service;



@Service
public class OfferService {

    private OfferRepo offerRepo;

    public OfferService(OfferRepo offerRepo) {
        this.offerRepo = offerRepo;
    }

    public void addOffer(Offer offer) {
        offerRepo.save(offer);
    }

    public Iterable<Offer> getAllOffers() {
        return offerRepo.findAll();
    }

    public void deleteOffer(Offer offer) {
        offerRepo.delete(offer);
    }

}
