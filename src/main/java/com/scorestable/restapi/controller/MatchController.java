package com.scorestable.restapi.controller;

import com.scorestable.restapi.model.Match;
import com.scorestable.restapi.service.MatchService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @Tag(name = "GET", description = "GET endpoints")
    @Operation(summary = "Get all matches", description = "Get the list of all matches")
    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @Tag(name = "GET", description = "GET endpoints")
    @Operation(summary = "Get match by id", description = "Get a match providing its ID. Returns 404 if the match is not found")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Match found", content = @Content(schema = @Schema(implementation = Match.class))),
            @ApiResponse(responseCode = "404", description = "Match not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Match> getMatchById(@PathVariable Long id) {
        Optional<Match> match = matchService.getMatchById(id);
        return match.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Tag(name = "POST", description = "POST endpoints")
    @Operation(summary = "Create a match", description = "Create a new match. Body exemple : {\"teamA\": \"Team A\", \"teamB\": \"Team B\", \"scoreA\": 0, \"scoreB\": 0}")
    @PostMapping
    public Match createMatch(Match match) {
        return matchService.createMatch(match);
    }

    @Tag(name = "DELETE", description = "DELETE endpoints")
    @Operation(summary = "Delete a match", description = "Delete a match providing its ID.")
    @DeleteMapping
    public void deleteMatch(Long id) {
        matchService.deleteMatch(id);
    }
}
