{norm = {it.upperInitial().lowerTrail().replaceTrailingBrackets().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper() }).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, { it.lower() }).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}; norm(n)}

{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
({y}{' '+any{certification}{imdb.certification}.replaceAll(/^\d+$/, 'PG-$0')})/
{norm(n)} -
{absolute.pad(episodelist.size() < 99 ? 2 : 3)}
{'Special '+special.pad(episodelist.size() < 99 ? 2 : 3)} -
{norm(t)}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ") + ')'}
{" Part $pi"}
{" [$vf $vc $ac $af]"}
