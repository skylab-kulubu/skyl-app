package com.skylab.skyl_app.business.abstracts;

import com.skylab.skyl_app.entities.Url;
import com.skylab.skyl_app.entities.dtos.UrlShortenDto;

import java.util.List;
import java.util.Optional;

public interface UrlService {

    Url redirect(String alias);

    void deleteUrl(int urlId);

    Url shorten(UrlShortenDto urlShortenDto);

    List<Url> getAllUrls();

    Url updateUrl(int urlId, UrlShortenDto urlShortenDto);

    List<Url> getUserUrls();

}
