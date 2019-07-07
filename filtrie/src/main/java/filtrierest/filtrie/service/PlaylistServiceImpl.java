package filtrierest.filtrie.service;


import filtrierest.filtrie.Repository.PlaylistJpaRepository;
import filtrierest.filtrie.Repository.UserJpaRepository;
import filtrierest.filtrie.model.PlaylistAggregate;
import filtrierest.filtrie.model.Video;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    private static Logger logger = LoggerFactory.getLogger(PlaylistServiceImpl.class);

    private UserJpaRepository userJpaRepository;
    private PlaylistJpaRepository playlistJpaRepository;

    @Autowired
    public PlaylistServiceImpl(UserJpaRepository userJpaRepository, PlaylistJpaRepository playlistJpaRepository)
    {
        this.userJpaRepository = userJpaRepository;
        this.playlistJpaRepository = playlistJpaRepository;
    }

    /*
        return json with specific url structure
     */
    public PlaylistAggregate getPlayList(Long userId)
    {
        PlaylistAggregate playAgg = new PlaylistAggregate();
        List<Video> list=getPlayListForUser(userId);

        list.forEach(vid->
        {
            playAgg.addVideo(vid);
        });

        return playAgg;
    }

    private List<Video> getPlayListForUser(Long userId)
    {
        return playlistJpaRepository.findByUserid(userId);
    }
}