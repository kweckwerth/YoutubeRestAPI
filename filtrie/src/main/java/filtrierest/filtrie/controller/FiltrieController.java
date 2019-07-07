package filtrierest.filtrie.controller;


import filtrierest.filtrie.model.PlaylistAggregate;
import filtrierest.filtrie.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FiltrieController
{
    @Autowired
    private PlaylistService playlistService;

    @GetMapping("playlist/{userId}")
    @CrossOrigin
    public PlaylistAggregate getPlaylist(@PathVariable Long userId)
    {
        //String playlist
        PlaylistAggregate pl=playlistService.getPlayList(userId);

        return pl;
    }
}
