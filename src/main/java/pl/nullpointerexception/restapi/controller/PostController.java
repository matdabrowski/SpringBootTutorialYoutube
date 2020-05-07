package pl.nullpointerexception.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointerexception.restapi.controller.dto.PostDto;
import pl.nullpointerexception.restapi.model.Post;
import pl.nullpointerexception.restapi.service.PostService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public List<PostDto> getPosts(@RequestParam(required = false) int page, Sort.Direction sort) {
        int pagetNumber = page >= 0 ? page : 0;
        return PostDtoMapper.mapToPostDtos(postService.getPosts(pagetNumber, sort));
    }

    @GetMapping("/posts/comments")
    public List<Post> getPostsWithComment(@RequestParam(required = false) int page, Sort.Direction sort) {
        int pagetNumber = page >= 0 ? page : 0;
        return postService.getPostsWithComments(pagetNumber, sort);
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id) {
        return postService.getSinglePost(id);
    }
}
