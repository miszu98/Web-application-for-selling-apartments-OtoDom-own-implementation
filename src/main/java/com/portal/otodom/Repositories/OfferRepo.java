package com.portal.otodom.Repositories;

import com.portal.otodom.Models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OfferRepo extends JpaRepository<Offer, Long> {
}
