import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bc extends j {
	@Override
	public String c() {
		return "scoreboard";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.scoreboard.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (!this.b(minecraftServer, n, arr)) {
			if (arr.length < 1) {
				throw new ck("commands.scoreboard.usage");
			} else {
				if ("objectives".equalsIgnoreCase(arr[0])) {
					if (arr.length == 1) {
						throw new ck("commands.scoreboard.objectives.usage");
					}

					if ("list".equalsIgnoreCase(arr[1])) {
						this.a(n, minecraftServer);
					} else if ("add".equalsIgnoreCase(arr[1])) {
						if (arr.length < 4) {
							throw new ck("commands.scoreboard.objectives.add.usage");
						}

						this.a(n, arr, 2, minecraftServer);
					} else if ("remove".equalsIgnoreCase(arr[1])) {
						if (arr.length != 3) {
							throw new ck("commands.scoreboard.objectives.remove.usage");
						}

						this.a(n, arr[2], minecraftServer);
					} else {
						if (!"setdisplay".equalsIgnoreCase(arr[1])) {
							throw new ck("commands.scoreboard.objectives.usage");
						}

						if (arr.length != 3 && arr.length != 4) {
							throw new ck("commands.scoreboard.objectives.setdisplay.usage");
						}

						this.i(n, arr, 2, minecraftServer);
					}
				} else if ("players".equalsIgnoreCase(arr[0])) {
					if (arr.length == 1) {
						throw new ck("commands.scoreboard.players.usage");
					}

					if ("list".equalsIgnoreCase(arr[1])) {
						if (arr.length > 3) {
							throw new ck("commands.scoreboard.players.list.usage");
						}

						this.j(n, arr, 2, minecraftServer);
					} else if ("add".equalsIgnoreCase(arr[1])) {
						if (arr.length < 5) {
							throw new ck("commands.scoreboard.players.add.usage");
						}

						this.k(n, arr, 2, minecraftServer);
					} else if ("remove".equalsIgnoreCase(arr[1])) {
						if (arr.length < 5) {
							throw new ck("commands.scoreboard.players.remove.usage");
						}

						this.k(n, arr, 2, minecraftServer);
					} else if ("set".equalsIgnoreCase(arr[1])) {
						if (arr.length < 5) {
							throw new ck("commands.scoreboard.players.set.usage");
						}

						this.k(n, arr, 2, minecraftServer);
					} else if ("reset".equalsIgnoreCase(arr[1])) {
						if (arr.length != 3 && arr.length != 4) {
							throw new ck("commands.scoreboard.players.reset.usage");
						}

						this.l(n, arr, 2, minecraftServer);
					} else if ("enable".equalsIgnoreCase(arr[1])) {
						if (arr.length != 4) {
							throw new ck("commands.scoreboard.players.enable.usage");
						}

						this.m(n, arr, 2, minecraftServer);
					} else if ("test".equalsIgnoreCase(arr[1])) {
						if (arr.length != 5 && arr.length != 6) {
							throw new ck("commands.scoreboard.players.test.usage");
						}

						this.n(n, arr, 2, minecraftServer);
					} else if ("operation".equalsIgnoreCase(arr[1])) {
						if (arr.length != 7) {
							throw new ck("commands.scoreboard.players.operation.usage");
						}

						this.o(n, arr, 2, minecraftServer);
					} else {
						if (!"tag".equalsIgnoreCase(arr[1])) {
							throw new ck("commands.scoreboard.players.usage");
						}

						if (arr.length < 4) {
							throw new ck("commands.scoreboard.players.tag.usage");
						}

						this.a(minecraftServer, n, arr, 2);
					}
				} else {
					if (!"teams".equalsIgnoreCase(arr[0])) {
						throw new ck("commands.scoreboard.usage");
					}

					if (arr.length == 1) {
						throw new ck("commands.scoreboard.teams.usage");
					}

					if ("list".equalsIgnoreCase(arr[1])) {
						if (arr.length > 3) {
							throw new ck("commands.scoreboard.teams.list.usage");
						}

						this.e(n, arr, 2, minecraftServer);
					} else if ("add".equalsIgnoreCase(arr[1])) {
						if (arr.length < 3) {
							throw new ck("commands.scoreboard.teams.add.usage");
						}

						this.b(n, arr, 2, minecraftServer);
					} else if ("remove".equalsIgnoreCase(arr[1])) {
						if (arr.length != 3) {
							throw new ck("commands.scoreboard.teams.remove.usage");
						}

						this.d(n, arr, 2, minecraftServer);
					} else if ("empty".equalsIgnoreCase(arr[1])) {
						if (arr.length != 3) {
							throw new ck("commands.scoreboard.teams.empty.usage");
						}

						this.h(n, arr, 2, minecraftServer);
					} else if ("join".equalsIgnoreCase(arr[1])) {
						if (arr.length < 4 && (arr.length != 3 || !(n instanceof aay))) {
							throw new ck("commands.scoreboard.teams.join.usage");
						}

						this.f(n, arr, 2, minecraftServer);
					} else if ("leave".equalsIgnoreCase(arr[1])) {
						if (arr.length < 3 && !(n instanceof aay)) {
							throw new ck("commands.scoreboard.teams.leave.usage");
						}

						this.g(n, arr, 2, minecraftServer);
					} else {
						if (!"option".equalsIgnoreCase(arr[1])) {
							throw new ck("commands.scoreboard.teams.usage");
						}

						if (arr.length != 4 && arr.length != 5) {
							throw new ck("commands.scoreboard.teams.option.usage");
						}

						this.c(n, arr, 2, minecraftServer);
					}
				}
			}
		}
	}

	private boolean b(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		int integer5 = -1;

		for (int integer6 = 0; integer6 < arr.length; integer6++) {
			if (this.b(arr, integer6) && "*".equals(arr[integer6])) {
				if (integer5 >= 0) {
					throw new cd("commands.scoreboard.noMultiWildcard");
				}

				integer5 = integer6;
			}
		}

		if (integer5 < 0) {
			return false;
		} else {
			List<String> list6 = Lists.newArrayList(this.a(minecraftServer).d());
			String string7 = arr[integer5];
			List<String> list8 = Lists.newArrayList();

			for (String string10 : list6) {
				arr[integer5] = string10;

				try {
					this.a(minecraftServer, n, arr);
					list8.add(string10);
				} catch (cd var12) {
					fi fi12 = new fi(var12.getMessage(), var12.a());
					fi12.b().a(a.RED);
					n.a(fi12);
				}
			}

			arr[integer5] = string7;
			n.a(o.a.AFFECTED_ENTITIES, list8.size());
			if (list8.isEmpty()) {
				throw new ck("commands.scoreboard.allMatchesFailed");
			} else {
				return true;
			}
		}
	}

	protected bec a(MinecraftServer minecraftServer) {
		return minecraftServer.a(0).ad();
	}

	protected bdy a(String string, boolean boolean2, MinecraftServer minecraftServer) throws cd {
		bec bec5 = this.a(minecraftServer);
		bdy bdy6 = bec5.b(string);
		if (bdy6 == null) {
			throw new cd("commands.scoreboard.objectiveNotFound", string);
		} else if (boolean2 && bdy6.c().b()) {
			throw new cd("commands.scoreboard.objectiveReadOnly", string);
		} else {
			return bdy6;
		}
	}

	protected bdz a(String string, MinecraftServer minecraftServer) throws cd {
		bec bec4 = this.a(minecraftServer);
		bdz bdz5 = bec4.d(string);
		if (bdz5 == null) {
			throw new cd("commands.scoreboard.teamNotFound", string);
		} else {
			return bdz5;
		}
	}

	protected void a(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		String string6 = arr[integer++];
		String string7 = arr[integer++];
		bec bec8 = this.a(minecraftServer);
		bei bei9 = (bei)bei.a.get(string7);
		if (bei9 == null) {
			throw new ck("commands.scoreboard.objectives.add.wrongType", string7);
		} else if (bec8.b(string6) != null) {
			throw new cd("commands.scoreboard.objectives.add.alreadyExists", string6);
		} else if (string6.length() > 16) {
			throw new ch("commands.scoreboard.objectives.add.tooLong", string6, 16);
		} else if (string6.isEmpty()) {
			throw new ck("commands.scoreboard.objectives.add.usage");
		} else {
			if (arr.length > integer) {
				String string10 = a(n, arr, integer).c();
				if (string10.length() > 32) {
					throw new ch("commands.scoreboard.objectives.add.displayTooLong", string10, 32);
				}

				if (string10.isEmpty()) {
					bec8.a(string6, bei9);
				} else {
					bec8.a(string6, bei9).a(string10);
				}
			} else {
				bec8.a(string6, bei9);
			}

			a(n, this, "commands.scoreboard.objectives.add.success", new Object[]{string6});
		}
	}

	protected void b(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		String string6 = arr[integer++];
		bec bec7 = this.a(minecraftServer);
		if (bec7.d(string6) != null) {
			throw new cd("commands.scoreboard.teams.add.alreadyExists", string6);
		} else if (string6.length() > 16) {
			throw new ch("commands.scoreboard.teams.add.tooLong", string6, 16);
		} else if (string6.isEmpty()) {
			throw new ck("commands.scoreboard.teams.add.usage");
		} else {
			if (arr.length > integer) {
				String string8 = a(n, arr, integer).c();
				if (string8.length() > 32) {
					throw new ch("commands.scoreboard.teams.add.displayTooLong", string8, 32);
				}

				if (string8.isEmpty()) {
					bec7.e(string6);
				} else {
					bec7.e(string6).a(string8);
				}
			} else {
				bec7.e(string6);
			}

			a(n, this, "commands.scoreboard.teams.add.success", new Object[]{string6});
		}
	}

	protected void c(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bdz bdz6 = this.a(arr[integer++], minecraftServer);
		if (bdz6 != null) {
			String string7 = arr[integer++].toLowerCase(Locale.ROOT);
			if (!"color".equalsIgnoreCase(string7)
				&& !"friendlyfire".equalsIgnoreCase(string7)
				&& !"seeFriendlyInvisibles".equalsIgnoreCase(string7)
				&& !"nametagVisibility".equalsIgnoreCase(string7)
				&& !"deathMessageVisibility".equalsIgnoreCase(string7)
				&& !"collisionRule".equalsIgnoreCase(string7)) {
				throw new ck("commands.scoreboard.teams.option.usage");
			} else if (arr.length == 4) {
				if ("color".equalsIgnoreCase(string7)) {
					throw new ck("commands.scoreboard.teams.option.noValue", string7, a(a.a(true, false)));
				} else if ("friendlyfire".equalsIgnoreCase(string7) || "seeFriendlyInvisibles".equalsIgnoreCase(string7)) {
					throw new ck("commands.scoreboard.teams.option.noValue", string7, a(Arrays.asList("true", "false")));
				} else if ("nametagVisibility".equalsIgnoreCase(string7) || "deathMessageVisibility".equalsIgnoreCase(string7)) {
					throw new ck("commands.scoreboard.teams.option.noValue", string7, a(bee.b.a()));
				} else if ("collisionRule".equalsIgnoreCase(string7)) {
					throw new ck("commands.scoreboard.teams.option.noValue", string7, a(bee.a.a()));
				} else {
					throw new ck("commands.scoreboard.teams.option.usage");
				}
			} else {
				String string8 = arr[integer];
				if ("color".equalsIgnoreCase(string7)) {
					a a9 = a.b(string8);
					if (a9 == null || a9.c()) {
						throw new ck("commands.scoreboard.teams.option.noValue", string7, a(a.a(true, false)));
					}

					bdz6.a(a9);
					bdz6.b(a9.toString());
					bdz6.c(a.RESET.toString());
				} else if ("friendlyfire".equalsIgnoreCase(string7)) {
					if (!"true".equalsIgnoreCase(string8) && !"false".equalsIgnoreCase(string8)) {
						throw new ck("commands.scoreboard.teams.option.noValue", string7, a(Arrays.asList("true", "false")));
					}

					bdz6.a("true".equalsIgnoreCase(string8));
				} else if ("seeFriendlyInvisibles".equalsIgnoreCase(string7)) {
					if (!"true".equalsIgnoreCase(string8) && !"false".equalsIgnoreCase(string8)) {
						throw new ck("commands.scoreboard.teams.option.noValue", string7, a(Arrays.asList("true", "false")));
					}

					bdz6.b("true".equalsIgnoreCase(string8));
				} else if ("nametagVisibility".equalsIgnoreCase(string7)) {
					bee.b b9 = bee.b.a(string8);
					if (b9 == null) {
						throw new ck("commands.scoreboard.teams.option.noValue", string7, a(bee.b.a()));
					}

					bdz6.a(b9);
				} else if ("deathMessageVisibility".equalsIgnoreCase(string7)) {
					bee.b b9 = bee.b.a(string8);
					if (b9 == null) {
						throw new ck("commands.scoreboard.teams.option.noValue", string7, a(bee.b.a()));
					}

					bdz6.b(b9);
				} else if ("collisionRule".equalsIgnoreCase(string7)) {
					bee.a a9 = bee.a.a(string8);
					if (a9 == null) {
						throw new ck("commands.scoreboard.teams.option.noValue", string7, a(bee.a.a()));
					}

					bdz6.a(a9);
				}

				a(n, this, "commands.scoreboard.teams.option.success", new Object[]{string7, bdz6.b(), string8});
			}
		}
	}

	protected void d(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		bdz bdz7 = this.a(arr[integer], minecraftServer);
		if (bdz7 != null) {
			bec6.d(bdz7);
			a(n, this, "commands.scoreboard.teams.remove.success", new Object[]{bdz7.b()});
		}
	}

	protected void e(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		if (arr.length > integer) {
			bdz bdz7 = this.a(arr[integer], minecraftServer);
			if (bdz7 == null) {
				return;
			}

			Collection<String> collection8 = bdz7.d();
			n.a(o.a.QUERY_RESULT, collection8.size());
			if (collection8.isEmpty()) {
				throw new cd("commands.scoreboard.teams.list.player.empty", bdz7.b());
			}

			fi fi9 = new fi("commands.scoreboard.teams.list.player.count", collection8.size(), bdz7.b());
			fi9.b().a(a.DARK_GREEN);
			n.a(fi9);
			n.a(new fh(a(collection8.toArray())));
		} else {
			Collection<bdz> collection7 = bec6.g();
			n.a(o.a.QUERY_RESULT, collection7.size());
			if (collection7.isEmpty()) {
				throw new cd("commands.scoreboard.teams.list.empty");
			}

			fi fi8 = new fi("commands.scoreboard.teams.list.count", collection7.size());
			fi8.b().a(a.DARK_GREEN);
			n.a(fi8);

			for (bdz bdz10 : collection7) {
				n.a(new fi("commands.scoreboard.teams.list.entry", bdz10.b(), bdz10.c(), bdz10.d().size()));
			}
		}
	}

	protected void f(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		String string7 = arr[integer++];
		Set<String> set8 = Sets.newHashSet();
		Set<String> set9 = Sets.newHashSet();
		if (n instanceof aay && integer == arr.length) {
			String string10 = a(n).h_();
			if (bec6.a(string10, string7)) {
				set8.add(string10);
			} else {
				set9.add(string10);
			}
		} else {
			while (integer < arr.length) {
				String string10 = arr[integer++];
				if (p.b(string10)) {
					for (sn sn13 : c(minecraftServer, n, string10)) {
						String string14 = e(minecraftServer, n, sn13.bf());
						if (bec6.a(string14, string7)) {
							set8.add(string14);
						} else {
							set9.add(string14);
						}
					}
				} else {
					String string11 = e(minecraftServer, n, string10);
					if (bec6.a(string11, string7)) {
						set8.add(string11);
					} else {
						set9.add(string11);
					}
				}
			}
		}

		if (!set8.isEmpty()) {
			n.a(o.a.AFFECTED_ENTITIES, set8.size());
			a(n, this, "commands.scoreboard.teams.join.success", new Object[]{set8.size(), string7, a(set8.toArray(new String[set8.size()]))});
		}

		if (!set9.isEmpty()) {
			throw new cd("commands.scoreboard.teams.join.failure", set9.size(), string7, a(set9.toArray(new String[set9.size()])));
		}
	}

	protected void g(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		Set<String> set7 = Sets.newHashSet();
		Set<String> set8 = Sets.newHashSet();
		if (n instanceof aay && integer == arr.length) {
			String string9 = a(n).h_();
			if (bec6.f(string9)) {
				set7.add(string9);
			} else {
				set8.add(string9);
			}
		} else {
			while (integer < arr.length) {
				String string9 = arr[integer++];
				if (p.b(string9)) {
					for (sn sn12 : c(minecraftServer, n, string9)) {
						String string13 = e(minecraftServer, n, sn12.bf());
						if (bec6.f(string13)) {
							set7.add(string13);
						} else {
							set8.add(string13);
						}
					}
				} else {
					String string10 = e(minecraftServer, n, string9);
					if (bec6.f(string10)) {
						set7.add(string10);
					} else {
						set8.add(string10);
					}
				}
			}
		}

		if (!set7.isEmpty()) {
			n.a(o.a.AFFECTED_ENTITIES, set7.size());
			a(n, this, "commands.scoreboard.teams.leave.success", new Object[]{set7.size(), a(set7.toArray(new String[set7.size()]))});
		}

		if (!set8.isEmpty()) {
			throw new cd("commands.scoreboard.teams.leave.failure", set8.size(), a(set8.toArray(new String[set8.size()])));
		}
	}

	protected void h(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		bdz bdz7 = this.a(arr[integer], minecraftServer);
		if (bdz7 != null) {
			Collection<String> collection8 = Lists.newArrayList(bdz7.d());
			n.a(o.a.AFFECTED_ENTITIES, collection8.size());
			if (collection8.isEmpty()) {
				throw new cd("commands.scoreboard.teams.empty.alreadyEmpty", bdz7.b());
			} else {
				for (String string10 : collection8) {
					bec6.a(string10, bdz7);
				}

				a(n, this, "commands.scoreboard.teams.empty.success", new Object[]{collection8.size(), bdz7.b()});
			}
		}
	}

	protected void a(n n, String string, MinecraftServer minecraftServer) throws cd {
		bec bec5 = this.a(minecraftServer);
		bdy bdy6 = this.a(string, false, minecraftServer);
		bec5.k(bdy6);
		a(n, this, "commands.scoreboard.objectives.remove.success", new Object[]{string});
	}

	protected void a(n n, MinecraftServer minecraftServer) throws cd {
		bec bec4 = this.a(minecraftServer);
		Collection<bdy> collection5 = bec4.c();
		if (collection5.isEmpty()) {
			throw new cd("commands.scoreboard.objectives.list.empty");
		} else {
			fi fi6 = new fi("commands.scoreboard.objectives.list.count", collection5.size());
			fi6.b().a(a.DARK_GREEN);
			n.a(fi6);

			for (bdy bdy8 : collection5) {
				n.a(new fi("commands.scoreboard.objectives.list.entry", bdy8.b(), bdy8.d(), bdy8.c().a()));
			}
		}
	}

	protected void i(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		String string7 = arr[integer++];
		int integer8 = bec.h(string7);
		bdy bdy9 = null;
		if (arr.length == 4) {
			bdy9 = this.a(arr[integer], false, minecraftServer);
		}

		if (integer8 < 0) {
			throw new cd("commands.scoreboard.objectives.setdisplay.invalidSlot", string7);
		} else {
			bec6.a(integer8, bdy9);
			if (bdy9 != null) {
				a(n, this, "commands.scoreboard.objectives.setdisplay.successSet", new Object[]{bec.b(integer8), bdy9.b()});
			} else {
				a(n, this, "commands.scoreboard.objectives.setdisplay.successCleared", new Object[]{bec.b(integer8)});
			}
		}
	}

	protected void j(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		if (arr.length > integer) {
			String string7 = e(minecraftServer, n, arr[integer]);
			Map<bdy, bea> map8 = bec6.c(string7);
			n.a(o.a.QUERY_RESULT, map8.size());
			if (map8.isEmpty()) {
				throw new cd("commands.scoreboard.players.list.player.empty", string7);
			}

			fi fi9 = new fi("commands.scoreboard.players.list.player.count", map8.size(), string7);
			fi9.b().a(a.DARK_GREEN);
			n.a(fi9);

			for (bea bea11 : map8.values()) {
				n.a(new fi("commands.scoreboard.players.list.player.entry", bea11.c(), bea11.d().d(), bea11.d().b()));
			}
		} else {
			Collection<String> collection7 = bec6.d();
			n.a(o.a.QUERY_RESULT, collection7.size());
			if (collection7.isEmpty()) {
				throw new cd("commands.scoreboard.players.list.empty");
			}

			fi fi8 = new fi("commands.scoreboard.players.list.count", collection7.size());
			fi8.b().a(a.DARK_GREEN);
			n.a(fi8);
			n.a(new fh(a(collection7.toArray())));
		}
	}

	protected void k(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		String string6 = arr[integer - 1];
		int integer7 = integer;
		String string8 = e(minecraftServer, n, arr[integer++]);
		if (string8.length() > 40) {
			throw new ch("commands.scoreboard.players.name.tooLong", string8, 40);
		} else {
			bdy bdy9 = this.a(arr[integer++], true, minecraftServer);
			int integer10 = "set".equalsIgnoreCase(string6) ? a(arr[integer++]) : a(arr[integer++], 0);
			if (arr.length > integer) {
				sn sn11 = b(minecraftServer, n, arr[integer7]);

				try {
					du du12 = ek.a(a(arr, integer));
					du du13 = a(sn11);
					if (!ee.a(du12, du13, true)) {
						throw new cd("commands.scoreboard.players.set.tagMismatch", string8);
					}
				} catch (ej var13) {
					throw new cd("commands.scoreboard.players.set.tagError", var13.getMessage());
				}
			}

			bec bec11 = this.a(minecraftServer);
			bea bea12 = bec11.c(string8, bdy9);
			if ("set".equalsIgnoreCase(string6)) {
				bea12.c(integer10);
			} else if ("add".equalsIgnoreCase(string6)) {
				bea12.a(integer10);
			} else {
				bea12.b(integer10);
			}

			a(n, this, "commands.scoreboard.players.set.success", new Object[]{bdy9.b(), string8, bea12.c()});
		}
	}

	protected void l(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		String string7 = e(minecraftServer, n, arr[integer++]);
		if (arr.length > integer) {
			bdy bdy8 = this.a(arr[integer++], false, minecraftServer);
			bec6.d(string7, bdy8);
			a(n, this, "commands.scoreboard.players.resetscore.success", new Object[]{bdy8.b(), string7});
		} else {
			bec6.d(string7, null);
			a(n, this, "commands.scoreboard.players.reset.success", new Object[]{string7});
		}
	}

	protected void m(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		String string7 = d(minecraftServer, n, arr[integer++]);
		if (string7.length() > 40) {
			throw new ch("commands.scoreboard.players.name.tooLong", string7, 40);
		} else {
			bdy bdy8 = this.a(arr[integer], false, minecraftServer);
			if (bdy8.c() != bei.c) {
				throw new cd("commands.scoreboard.players.enable.noTrigger", bdy8.b());
			} else {
				bea bea9 = bec6.c(string7, bdy8);
				bea9.a(false);
				a(n, this, "commands.scoreboard.players.enable.success", new Object[]{bdy8.b(), string7});
			}
		}
	}

	protected void n(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		String string7 = e(minecraftServer, n, arr[integer++]);
		if (string7.length() > 40) {
			throw new ch("commands.scoreboard.players.name.tooLong", string7, 40);
		} else {
			bdy bdy8 = this.a(arr[integer++], false, minecraftServer);
			if (!bec6.b(string7, bdy8)) {
				throw new cd("commands.scoreboard.players.test.notFound", bdy8.b(), string7);
			} else {
				int integer9 = arr[integer].equals("*") ? Integer.MIN_VALUE : a(arr[integer]);
				integer++;
				int integer10 = integer < arr.length && !arr[integer].equals("*") ? a(arr[integer], integer9) : Integer.MAX_VALUE;
				bea bea11 = bec6.c(string7, bdy8);
				if (bea11.c() >= integer9 && bea11.c() <= integer10) {
					a(n, this, "commands.scoreboard.players.test.success", new Object[]{bea11.c(), integer9, integer10});
				} else {
					throw new cd("commands.scoreboard.players.test.failed", bea11.c(), integer9, integer10);
				}
			}
		}
	}

	protected void o(n n, String[] arr, int integer, MinecraftServer minecraftServer) throws cd {
		bec bec6 = this.a(minecraftServer);
		String string7 = e(minecraftServer, n, arr[integer++]);
		bdy bdy8 = this.a(arr[integer++], true, minecraftServer);
		String string9 = arr[integer++];
		String string10 = e(minecraftServer, n, arr[integer++]);
		bdy bdy11 = this.a(arr[integer], false, minecraftServer);
		if (string7.length() > 40) {
			throw new ch("commands.scoreboard.players.name.tooLong", string7, 40);
		} else if (string10.length() > 40) {
			throw new ch("commands.scoreboard.players.name.tooLong", string10, 40);
		} else {
			bea bea12 = bec6.c(string7, bdy8);
			if (!bec6.b(string10, bdy11)) {
				throw new cd("commands.scoreboard.players.operation.notFound", bdy11.b(), string10);
			} else {
				bea bea13 = bec6.c(string10, bdy11);
				if ("+=".equals(string9)) {
					bea12.c(bea12.c() + bea13.c());
				} else if ("-=".equals(string9)) {
					bea12.c(bea12.c() - bea13.c());
				} else if ("*=".equals(string9)) {
					bea12.c(bea12.c() * bea13.c());
				} else if ("/=".equals(string9)) {
					if (bea13.c() != 0) {
						bea12.c(bea12.c() / bea13.c());
					}
				} else if ("%=".equals(string9)) {
					if (bea13.c() != 0) {
						bea12.c(bea12.c() % bea13.c());
					}
				} else if ("=".equals(string9)) {
					bea12.c(bea13.c());
				} else if ("<".equals(string9)) {
					bea12.c(Math.min(bea12.c(), bea13.c()));
				} else if (">".equals(string9)) {
					bea12.c(Math.max(bea12.c(), bea13.c()));
				} else {
					if (!"><".equals(string9)) {
						throw new cd("commands.scoreboard.players.operation.invalidOperation", string9);
					}

					int integer14 = bea12.c();
					bea12.c(bea13.c());
					bea13.c(integer14);
				}

				a(n, this, "commands.scoreboard.players.operation.success", new Object[0]);
			}
		}
	}

	protected void a(MinecraftServer minecraftServer, n n, String[] arr, int integer) throws cd {
		String string6 = e(minecraftServer, n, arr[integer]);
		sn sn7 = b(minecraftServer, n, arr[integer++]);
		String string8 = arr[integer++];
		Set<String> set9 = sn7.P();
		if ("list".equals(string8)) {
			if (!set9.isEmpty()) {
				fi fi10 = new fi("commands.scoreboard.players.tag.list", string6);
				fi10.b().a(a.DARK_GREEN);
				n.a(fi10);
				n.a(new fh(a(set9.toArray())));
			}

			n.a(o.a.QUERY_RESULT, set9.size());
		} else if (arr.length < 5) {
			throw new ck("commands.scoreboard.players.tag.usage");
		} else {
			String string10 = arr[integer++];
			if (arr.length > integer) {
				try {
					du du11 = ek.a(a(arr, integer));
					du du12 = a(sn7);
					if (!ee.a(du11, du12, true)) {
						throw new cd("commands.scoreboard.players.tag.tagMismatch", string6);
					}
				} catch (ej var12) {
					throw new cd("commands.scoreboard.players.tag.tagError", var12.getMessage());
				}
			}

			if ("add".equals(string8)) {
				if (!sn7.a(string10)) {
					throw new cd("commands.scoreboard.players.tag.tooMany", 1024);
				}

				a(n, this, "commands.scoreboard.players.tag.success.add", new Object[]{string10});
			} else {
				if (!"remove".equals(string8)) {
					throw new ck("commands.scoreboard.players.tag.usage");
				}

				if (!sn7.b(string10)) {
					throw new cd("commands.scoreboard.players.tag.notFound", string10);
				}

				a(n, this, "commands.scoreboard.players.tag.success.remove", new Object[]{string10});
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"objectives", "players", "teams"});
		} else {
			if ("objectives".equalsIgnoreCase(arr[0])) {
				if (arr.length == 2) {
					return a(arr, new String[]{"list", "add", "remove", "setdisplay"});
				}

				if ("add".equalsIgnoreCase(arr[1])) {
					if (arr.length == 4) {
						Set<String> set6 = bei.a.keySet();
						return a(arr, set6);
					}
				} else if ("remove".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, this.a(false, minecraftServer));
					}
				} else if ("setdisplay".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, bec.h());
					}

					if (arr.length == 4) {
						return a(arr, this.a(false, minecraftServer));
					}
				}
			} else if ("players".equalsIgnoreCase(arr[0])) {
				if (arr.length == 2) {
					return a(arr, new String[]{"set", "add", "remove", "reset", "list", "enable", "test", "operation", "tag"});
				}

				if ("set".equalsIgnoreCase(arr[1]) || "add".equalsIgnoreCase(arr[1]) || "remove".equalsIgnoreCase(arr[1]) || "reset".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, minecraftServer.J());
					}

					if (arr.length == 4) {
						return a(arr, this.a(true, minecraftServer));
					}
				} else if ("enable".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, minecraftServer.J());
					}

					if (arr.length == 4) {
						return a(arr, this.b(minecraftServer));
					}
				} else if ("list".equalsIgnoreCase(arr[1]) || "test".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, this.a(minecraftServer).d());
					}

					if (arr.length == 4 && "test".equalsIgnoreCase(arr[1])) {
						return a(arr, this.a(false, minecraftServer));
					}
				} else if ("operation".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, this.a(minecraftServer).d());
					}

					if (arr.length == 4) {
						return a(arr, this.a(true, minecraftServer));
					}

					if (arr.length == 5) {
						return a(arr, new String[]{"+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><"});
					}

					if (arr.length == 6) {
						return a(arr, minecraftServer.J());
					}

					if (arr.length == 7) {
						return a(arr, this.a(false, minecraftServer));
					}
				} else if ("tag".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, this.a(minecraftServer).d());
					}

					if (arr.length == 4) {
						return a(arr, new String[]{"add", "remove", "list"});
					}
				}
			} else if ("teams".equalsIgnoreCase(arr[0])) {
				if (arr.length == 2) {
					return a(arr, new String[]{"add", "remove", "join", "leave", "empty", "list", "option"});
				}

				if ("join".equalsIgnoreCase(arr[1])) {
					if (arr.length == 3) {
						return a(arr, this.a(minecraftServer).f());
					}

					if (arr.length >= 4) {
						return a(arr, minecraftServer.J());
					}
				} else {
					if ("leave".equalsIgnoreCase(arr[1])) {
						return a(arr, minecraftServer.J());
					}

					if ("empty".equalsIgnoreCase(arr[1]) || "list".equalsIgnoreCase(arr[1]) || "remove".equalsIgnoreCase(arr[1])) {
						if (arr.length == 3) {
							return a(arr, this.a(minecraftServer).f());
						}
					} else if ("option".equalsIgnoreCase(arr[1])) {
						if (arr.length == 3) {
							return a(arr, this.a(minecraftServer).f());
						}

						if (arr.length == 4) {
							return a(arr, new String[]{"color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility", "collisionRule"});
						}

						if (arr.length == 5) {
							if ("color".equalsIgnoreCase(arr[3])) {
								return a(arr, a.a(true, false));
							}

							if ("nametagVisibility".equalsIgnoreCase(arr[3]) || "deathMessageVisibility".equalsIgnoreCase(arr[3])) {
								return a(arr, bee.b.a());
							}

							if ("collisionRule".equalsIgnoreCase(arr[3])) {
								return a(arr, bee.a.a());
							}

							if ("friendlyfire".equalsIgnoreCase(arr[3]) || "seeFriendlyInvisibles".equalsIgnoreCase(arr[3])) {
								return a(arr, new String[]{"true", "false"});
							}
						}
					}
				}
			}

			return Collections.emptyList();
		}
	}

	protected List<String> a(boolean boolean1, MinecraftServer minecraftServer) {
		Collection<bdy> collection4 = this.a(minecraftServer).c();
		List<String> list5 = Lists.newArrayList();

		for (bdy bdy7 : collection4) {
			if (!boolean1 || !bdy7.c().b()) {
				list5.add(bdy7.b());
			}
		}

		return list5;
	}

	protected List<String> b(MinecraftServer minecraftServer) {
		Collection<bdy> collection3 = this.a(minecraftServer).c();
		List<String> list4 = Lists.newArrayList();

		for (bdy bdy6 : collection3) {
			if (bdy6.c() == bei.c) {
				list4.add(bdy6.b());
			}
		}

		return list4;
	}

	@Override
	public boolean b(String[] arr, int integer) {
		if (!"players".equalsIgnoreCase(arr[0])) {
			return "teams".equalsIgnoreCase(arr[0]) ? integer == 2 : false;
		} else {
			return arr.length > 1 && "operation".equalsIgnoreCase(arr[1]) ? integer == 2 || integer == 5 : integer == 2;
		}
	}
}
