{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/).replaceTrailingBrackets()}
{' '+n.match(/\([A-Z]+\)$/)}
{if (norm(n) != norm (primaryTitle)) ' ('+norm(primaryTitle)+')'}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{if (y) {' ['+y +']'}}
{' '+any{"[$certification]"}{"["+$imdb.certification+"]" }.replaceAll('N A','').replaceAll(/^ \d+$/, 'PG-$0')}
{" [$rating" + "★]"} [
{csv('C:/FileBot/Formats/Shows/TVNetwork.csv').get(info.network) ?: info.network }]/
{[episodelist.findAll{ it.season == s }.airdate.year.min()]}
{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}/
{csv('C:/FileBot/Formats/Shows/TVFileShowNames.csv').get(n) ?: norm(n).replaceTrailingBrackets()}
{' '+n.match(/\([A-Z]+\)$/)}
{' '+n.match(/\([0-9]+\)$/)}
{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}
{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", { group, match -> ' (Part '+match.pad(2)+')' }))}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot| unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ')'}
{t.replacePart(' [$1]')} -
{" [$minutes Min]"}
{' '+[airdate.format("yyyy-MM-dd")]}
{" [$vf $ac $af]"}
